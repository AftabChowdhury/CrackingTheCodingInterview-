package Chapter01;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
	public static boolean hasUniqueChars(String toTest) {
		Set<Character> set = new HashSet<>();
		if(toTest != null && !toTest.isEmpty()) {
			for(char c : toTest.toCharArray()) {
				if(set.contains(c)) {
					return false;
				}
				set.add(c);
			}
			return true;
			
		}else {
			return false;
		}
			
	}
	
	public static void main(String [] args) {
		
		// should pass
	    String test = "abcdef89372";
				
		// should fail, many dupes
		String test2 = "abcbca2892";
		String test4 = "";
		
		System.out.println(hasUniqueChars(test));
		System.out.println(hasUniqueChars(test2));
		System.out.println(hasUniqueChars(test4));
		
	}

}
