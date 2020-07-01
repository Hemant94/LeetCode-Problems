import java.util.ArrayList;
import java.util.List;

public class LC20 {
//https://leetcode.com/problems/perfect-number/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 28;
		System.out.println(checkPerfectNumber(num));
	}
	
	public static boolean checkPerfectNumber(int num) {
	List<Integer> list = new ArrayList<>();
    if (num > 0){
      for (int i = 1; i < num; i++) {
        if (num % i == 0) {
          list.add(i);
        }
      }
    } else {
      return false;
    }

    return list.stream()
        .mapToInt(Integer::intValue)
        .sum() == num;
  }

}
