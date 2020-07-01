import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class LC14 {
//https://leetcode.com/problems/majority-element/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {3,2,3};
		System.out.println(majorityElement(arr));

	}
	public static int majorityElement(int[] nums) {
	       
        Map<Integer,Integer> freqTable = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(e -> e, Collectors.reducing(0, e -> 1, Integer::sum)));
                                        
        int maxValueInfreqTable  = Collections.max(freqTable.values());
        
        for(Map.Entry <Integer, Integer> m: freqTable.entrySet()){
            if(m.getValue().equals(maxValueInfreqTable)) return m.getKey();
        }                       
        return -1;
  }
            

}
