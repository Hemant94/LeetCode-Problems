import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC6 {
//https://leetcode.com/problems/top-k-frequent-elements/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {1,1,1,2,2,3};
		int k=2;
		System.out.println(topKFrequent(arr, k));
		
	}
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> unsortedMap = new HashMap<>();
        
        for(int i:nums) {
            unsortedMap.put(i, unsortedMap.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        unsortedMap.entrySet().stream().
            sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k)
                .forEachOrdered(x -> list.add(x.getKey()));
        
        return list;
    }

}
