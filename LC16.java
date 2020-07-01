import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC16 {
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(arr));
		
	}
	public static  List findDisappearedNumbers(int[] nums) {
		List _list=Arrays.stream(nums).boxed().collect(Collectors.toList());
		List _result=new ArrayList();
		for(int i=1;i<=nums.length;i++){
		if(!_list.contains(i)){
		_result.add(i);
		}
		}
		return _result;
		}

}
