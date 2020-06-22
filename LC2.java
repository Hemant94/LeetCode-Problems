import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LC2 {
//https://leetcode.com/problems/uncommon-words-from-two-sentences/
	 public  static List<String> uncommonFromSentences(String A, String B) {
	        String[] a = A.split(" ");
	        String[] b = B.split(" ");
	        Set<String> sa = buildSentenceSet(a);
	        Set<String> sb = buildSentenceSet(b);        
	        sa = findUncommonWords(a, b, sa, sb);
	        List<String> list= new ArrayList<>(sa);
	        return list;
	    }
	    
	 public static Set<String> findUncommonWords(String[] a, String[] b, Set<String> sa, Set<String> sb) {
			sa.removeAll(Arrays.asList(b));
	        sb.removeAll(Arrays.asList(a));
	        sa.addAll(sb);
	        return sa;
		}

	 public static Set<String> buildSentenceSet(String[] a) {
			Map<String, Long> words = Arrays.stream(a).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
			Set<String> sa = words.entrySet().stream()
				.filter(e-> e.getValue() < 2)
				.map(e -> e.getKey())
				.collect(Collectors.toSet());
			return sa;
		}
		
		public static void main(String[] args) {
			String A="this apple is sweet";
			String B= "this apple is sour";
			
			System.out.println(uncommonFromSentences(A, B));
		}
		
		
}
