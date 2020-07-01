import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC19 {
//https://leetcode.com/problems/find-common-characters/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[] {"bella","label","roller"};
		System.out.println(commonChars(strArray));
	}
	
	public static List<String> commonChars(String[] words) {
	    List<String> inputs = new ArrayList<>(Arrays.asList(words));
	    List<String> matches = new ArrayList<>();
	    String[] letters = words[0].split("");
	    for (String letterToLookFor : letters) {
	      boolean match = inputs.stream().allMatch(word -> word.contains(letterToLookFor));
	      if (match) {
	        inputs = inputs.stream()
	            .map(word -> word.replaceFirst(letterToLookFor, ""))
	            .collect(Collectors.toList());
	        matches.add(letterToLookFor);
	      }
	    }    
	    return matches;
	  }

}
