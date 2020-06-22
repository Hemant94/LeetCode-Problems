import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LC10 {
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
	
	
	public static List<String> permute(String digits, HashMap<Character, List<Character>> map) {
		   if(digits.length() == 1) {
	            return map.get(digits.charAt(0)).stream().map(ch -> ch.toString()).collect(Collectors.toList());
	        }
	        List<String> arr = permute(digits.substring(1, digits.length()), map);
	        
	        List<Character> curr = map.get(digits.charAt(0));
	        ArrayList<String> permutations = new ArrayList<>();
	        
	        arr.stream().forEach(str -> {
	            curr.stream().forEach(c -> {
	                permutations.add(c+str);
	            });
	        });
	        
	        return permutations;
	    }
	    
	    public static List<String> letterCombinations(String digits) {
	        if(digits.length() == 0) {
	            return new ArrayList();
	        }
	        HashMap<Character, List<Character>> map = new HashMap();
	        map.put('2', new ArrayList<Character>(Arrays.asList('a', 'b', 'c')));
	        map.put('3', new ArrayList<Character>(Arrays.asList('d', 'e', 'f')));
	        map.put('4', new ArrayList<Character>(Arrays.asList('g', 'h', 'i')));
	        map.put('5', new ArrayList<Character>(Arrays.asList('j', 'k', 'l')));
	        map.put('6', new ArrayList<Character>(Arrays.asList('m', 'n', 'o')));
	        map.put('7', new ArrayList<Character>(Arrays.asList('p', 'q', 'r', 's')));
	        map.put('8', new ArrayList<Character>(Arrays.asList('t', 'u', 'v')));
	        map.put('9', new ArrayList<Character>(Arrays.asList('w', 'x', 'y', 'z')));
	        return permute(digits, map);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="23";
		System.out.println(letterCombinations(str));

	}

}
