import java.util.PriorityQueue;

public class LC5 {
//https://leetcode.com/problems/kth-largest-element-in-an-array/
	public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        for(int n : nums){
            pq.add(n);
        }
        for(int i = 0; i < k - 1; i++){
            pq.poll();
        }
        return pq.poll();
    }
	
	public static void main(String[] args) {
		int[] numsArray= new int[] {3,2,1,5,6,4};
		int k=2;
		System.out.println(findKthLargest(numsArray, k));
	}
}
