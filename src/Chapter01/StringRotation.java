package Chapter01;

public class StringRotation {
	public static boolean isStringRotation(String s1, String s2){
		if(s1.length()!=s2.length()) return false;
		
		String startingRotation = "";
		String endRotation = "";
		String fullRotation = "";
		int i = 0;
		
		for(int j=0; j < s2.length(); j++){
			 //we’ve reached the potential start of rotation 
			char s2Char = s2.charAt(j);
			char s1Char = s1.charAt(i);
			 if (s2Char == s1Char){ 
			   startingRotation += s2Char;
			   i++;
			  } else {
			   endRotation += s2Char;
			  }
	    }
		 fullRotation = startingRotation + endRotation;
		 
		 if (fullRotation.equals(s1)){
		  return true;
		 } else {
		  return false;
		 }
	}
	
	public static void main(String [] args) {
		
		System.out.println(isStringRotation("waterbottle","erbottlewat"));
		System.out.println(isStringRotation("race","cera"));
		System.out.println(isStringRotation("xyz","yzr"));
		System.out.println(isStringRotation("xxtttarrra","axxtttarrr"));
		
	}

}
