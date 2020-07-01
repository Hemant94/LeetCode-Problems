
public class LC11 {

	//https://leetcode.com/problems/valid-palindrome/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s= "A man, a plan, a canal: Panama";
			System.out.println(isPalindrome(s));
	}
	    public static boolean isPalindrome(String s) {
	        StringBuilder sb = new StringBuilder();
	        s.chars()
	            .filter(c -> Character.isLetter(c) || Character.isDigit(c))
	            .mapToObj(c -> Character.toLowerCase((char) c))
	            .forEach(sb::append);
	        return sb.toString().equals(sb.reverse().toString());
	    }

}
