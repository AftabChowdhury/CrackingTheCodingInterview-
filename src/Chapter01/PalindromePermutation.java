package Chapter01;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
	
	public static boolean isPalindromePermutation(String toTest) {
		Set<Character> set = new HashSet<>();
		if(toTest != null && !toTest.isEmpty()) {
			toTest = toTest.toLowerCase();
			for(char c : toTest.toCharArray()) {
				if(set.contains(c)) {
					set.remove(c);
				} else {
					set.add(c);	
				}
			}		
		}
		if(set.size() <=1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String [] args) {
		String test1 = "TactCoa";
		String test2 = "abcde";
		
		System.out.println(isPalindromePermutation(test1));
		
	}

}
