package day29;

import java.util.Scanner;

public class MethodWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				// Arrays.sort(arr) ; 		
//				holdYourHorse("Anar"); 
//				//holdYourHorse(12321);  // does not compile if datatype not match
//				holdYourHorse("David"); 
//				holdYourHorse("Fatma"); 
//				holdYourHorse("Sumeyye"); 

		Scanner scan = new Scanner(System.in);
		System.out.println("HOLD WHOESE HORSE?");
		String name = scan.next();
		holdYourHorse(name);

	}

	// parameter
	public static void holdYourHorse(String owner) {
		// String owner = "Anar" ;
		System.out.println(owner + ", hold your horse please!");
	}

}