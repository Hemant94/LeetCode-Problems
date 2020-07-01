import java.util.Arrays;
import java.util.Set;

public class LC13 {
//https://leetcode.com/problems/missing-number/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] srr= new int[]{3,0,1};
		System.out.println(missingNumber(srr));

	}
	    public static int missingNumber(int[] nums) {
	    	int n = nums.length;
	        return n*(n+1)/2 - Arrays.stream(nums).sum();
	    }
	    

}
