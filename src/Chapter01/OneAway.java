package Chapter01;

public class OneAway {
	
	public static boolean IsOneAway(String s1, String s2) {
		int count = 0;
		int minlength = Math.min(s1.length(), s2.length());
		int lengthDifferent = Math.abs(s1.length() - s2.length());
		if(lengthDifferent>1) {
			return false;
		}
		for (int i = 0, j =0; i<minlength || j<minlength; i++,j++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(j);
			if(c1!=c2) {
				count++;
				if(count>1) return false;
				if(s1.length()>s2.length()) {
					j--;
				}
				if(s1.length()<s2.length()) {
					i--;
				}
			}
			
		}	
		return true;
	}
	public static void main(String [] args) {
		System.out.println(IsOneAway("pale", "ple"));
		System.out.println(IsOneAway("pales", "pale"));
		System.out.println(IsOneAway("pale", "bale"));
		System.out.println(IsOneAway("pale", "bake"));
		System.out.println(IsOneAway("p", ""));
		System.out.println(IsOneAway("", "bake"));
		System.out.println(IsOneAway("pr", "r"));
		System.out.println(IsOneAway("pr", "rp"));
		System.out.println(IsOneAway("brrr", "brrss"));
		System.out.println(IsOneAway("abc", "acs"));
		System.out.println(IsOneAway("aple", "aple"));
	}

}
