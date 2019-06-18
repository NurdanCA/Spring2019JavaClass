package day48;

	
	
	import day48sub.Animal;

	/// if the field is in same package different class 
	///  protected, default are both accessible 

	///  if the field is in different package in sub class 
	///  protected + public 

	public class AnimalOutsider extends Animal{

		public static void main(String[] args) {

			// ANIMAL IS IN DIFFERENT PACKAGE 
			//Animal a = new Animal() ; 
			AnimalOutsider o = new AnimalOutsider(); 
			
			//System.out.println( a.wild );
			
			
			System.out.println(  o.wild );
			//System.out.println(  a.breed );
			System.out.println(  o.color );
			//System.out.println(  a.legCount );
			

		}

	}