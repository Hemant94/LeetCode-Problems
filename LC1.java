import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//https://leetcode.com/problems/most-common-word/
public class LC1{

	public static String mostCommonWord(String paragraph, String[] banned) {
		Set<String> banDict = Arrays.stream(banned)
	            .collect(Collectors.toCollection(HashSet::new));
	    // parse paragraph to array[]
	    String[] input = paragraph.split("\\W+");
	    input = Arrays.stream(input)
	            .map(String::toLowerCase)
	            .toArray(String[]::new);
	    
	    // word count need a hashset to record the banned a hashmap to count word a pair of <mostFrquent, string>
	    Map<String, Integer> count = new HashMap<>();
	    int max = 0;
	    String res = null;
	    for (String s : input) {
	        if(!banDict.contains(s)) {
	            int num = count.getOrDefault(s, 0);
	            if (num == max) {
	                max++;
	                res = s;
	            }
	            count.put(s, num + 1);
	        }
	    }
	    return res;
    }
	
	public static void main(String[] args) {
		String para= "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = new String[] {"hit"};
		System.out.println(mostCommonWord(para, banned));
	}
	
}

