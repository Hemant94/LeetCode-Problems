import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LC9 {
//https://leetcode.com/problems/group-anagrams/
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = IntStream
                .range(0, strs.length)
                .mapToObj(i -> strs[i])
                .collect(Collectors.groupingBy(x -> getAnagramsKey(x), Collectors.toList()));
        return map.entrySet().stream().flatMap(x -> Stream.of(x.getValue())).collect(Collectors.toList());
    }

    public static String getAnagramsKey(String str) {
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        for(Character ch: str.toCharArray())
            arr[ch - 'a']++;
        IntStream.range(0, 26).mapToObj(i -> arr[i]).forEach(x -> sb.append(x + ","));
        return sb.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(str));
		
		
	}

}
