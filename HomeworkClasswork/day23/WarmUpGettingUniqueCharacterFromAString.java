package day23;

public class WarmUpGettingUniqueCharacterFromAString {
	public static void main(String[] args) {
	/*
	 * write a program to get unique characters from a string  
	 * : aaabbccc —> abc
	 * */
	String str = "aaabbccc" ; 
	String uniqueStr = "" ; 
	
	for (int i = 0; i < str.length(); i++) {
		
		String eachChar = str.substring(i, i+1) ; 
		
		if(! uniqueStr.contains(eachChar) ) {
			uniqueStr += eachChar ; 
			//System.out.print(eachChar);
		}
	}
	System.out.println(uniqueStr);
	
	
	

}

}
