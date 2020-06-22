import java.util.HashMap;
import java.util.Map;

public class LC8 {
//https://leetcode.com/problems/subarray-sum-equals-k/
	
	public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sums = new HashMap<>();
		// sum of empty array; there's exactly one count of it
        sums.put(0, 1);
        
        int sum = 0;
        int count = 0;
        
        for (int i : nums) {
            sum += i;
            
            count += sums.getOrDefault(sum - k, 0);
            sums.merge(sum, 1, (v1, v2) -> v1 + v2);
        }
        
        return count;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {1,1,1};
		int k=2;
		System.out.println(subarraySum(arr, k));

	}

}
