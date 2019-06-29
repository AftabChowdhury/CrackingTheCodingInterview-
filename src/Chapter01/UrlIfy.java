package Chapter01;

public class UrlIfy {
     public static String replaceMethod(String str) {
    	 str = str.trim();
    	 str = str.replace(" ", "%20");
    	 return str;
     }  
     
     public static void main(String [] args) {
    	 String str = "Mr John Smith   ";
    	 System.out.println(replaceMethod(str));
     }
}
