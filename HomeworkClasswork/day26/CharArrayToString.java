package day26;

import java.util.Arrays;

public class CharArrayToString {
	public static void main(String[] args) {
		
	String str1="Muattar"	;
	char[]nameChars=str1.toCharArray();
	System.out.println(Arrays.toString(nameChars));
		String str2="";
		for(int i=0; i<nameChars.length;i++) {
			
			char c =nameChars[i]; 
			str2=str2+c;
			System.out.print(c+""); //bu yada asagidaki de ayni sonuu veriyor 
System.out.print(nameChars[i]);
			}
		
		System.out.println();
		System.out.println(str2);
		
		
	//    String str2  = new String( nameChars  ) ;      
	   /// System.out.println( str2);
	//    
	    
	    
	}
}
