package Chapter01;

public class StringCompression {
	public static String doStringCompression(String s){
		int count = 1;
		String result = "";
		for (int i=0; i<s.length()-1;i++) {
			char currChar = s.charAt(i);
			char nextChar = s.charAt(i+1);
			if(currChar==nextChar) {
				count++;
				if(i==s.length()-2) {
					result=result+currChar+ Integer.toString(count);
				}
			}else {
				result=result+currChar+ Integer.toString(count);
				count=1;
			}
		}
		if(result ==""||result.length()>=s.length()) {
			result=s;
		}
		return result;
	}
	
	public static void main(String[] agrs) {
		System.out.println(doStringCompression("aabcccccaaa"));
		System.out.println(doStringCompression("aa"));
		System.out.println(doStringCompression("aaAAaa"));
		System.out.println(doStringCompression("aaaAAaa"));
		System.out.println(doStringCompression(""));
	}

}
