import java.util.HashSet;

public class LC12 {
	//https://leetcode.com/problems/happy-number/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i= 19;
			System.out.println(isHappy(i));
	}
	
	 public static boolean isHappy(int n) {
	String num = Integer.toString(n);
	HashSet<Integer> collection = new HashSet<Integer>();

	while (n != 1) {
		n = 0;
		for (int i = 0; i < num.length(); i++) {
			n += (Integer.parseInt(num.substring(i, i + 1))) * (Integer.parseInt(num.substring(i, i + 1)));
		}

		if (collection.contains(n)) {
			return false;
		} else {
			collection.add(n);
		}

		num = Integer.toString(n);
	}
	return true;

	 }
	 
}
