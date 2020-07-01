import java.util.HashMap;
import java.util.Map;

public class LC18 {
//https://leetcode.com/problems/jewels-and-stones/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J= "aA";
		String S= "aAAbbbb";
		System.out.println(numJewelsInStones(J, S));
	}
	public static int numJewelsInStones(String J, String S) {
        Map<Character, Integer> stonesFrequencies = new HashMap<>();
        for (char ch : S.toCharArray()) {
            stonesFrequencies.computeIfPresent(ch, (k, v) -> ++v);
            stonesFrequencies.putIfAbsent(ch, 1);
        }
        int res = 0;
        for (char ch : J.toCharArray()) {
            res += stonesFrequencies.getOrDefault(ch, 0);
        }
        return res;
    }

}
