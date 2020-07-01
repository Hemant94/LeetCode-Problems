import java.util.Arrays;
import java.util.OptionalInt;

public class LC17 {
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {1,2,3};
		System.out.println(minMoves(arr));
	}
	
	public static int minMoves(int[] nums) {
        OptionalInt min = Arrays.stream(nums).min();
        int sum = Arrays.stream(nums).sum();
        return sum - nums.length*min.getAsInt();
    }
	

}
