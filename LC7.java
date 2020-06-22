import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LC7 {

	//https://leetcode.com/problems/longest-palindromic-substring/
	
	public static String longestPalindrome(String s) {
		if (s.length() < 2) {
			return s;
		}
		if (s.length() == 2) {
			return s.charAt(0) == s.charAt(1) ? s : s.substring(0, 1);
		}
		
		Stream<int[]> solution1 = IntStream.range(0, s.length()).mapToObj(i -> maxPalindrome(s, i, i + 1));
		Stream<int[]> solution2 = IntStream.range(1, s.length() - 1).mapToObj(i -> maxPalindrome(s, i - 1, i + 1));
		int[] ret = Stream.concat(solution1, solution2).max((p1, p2) -> p1[1] - p1[0] - p2[1] + p2[0]).get();
		return s.substring(ret[0], ret[1] + 1);

	}

	public static int[] maxPalindrome(String s, int a, int b) {
		int[] ret = new int[] { a, a };
		while (a >= 0 && b < s.length() && s.charAt(a) == s.charAt(b)) {
			ret = new int[] { a, b };
			a--;
			b++;
		}
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "babad";
		System.out.println(longestPalindrome(s));
	}

}
