package day42;
import java.util.ArrayList;
import java.util.Arrays;
public class ForeachLoopandForLoopinArray {

	

	  public static void main(String[] args) {
	    
	    ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(10,2,33,24,15)  ) ; 
	    
	    
	    int i = 10 ; // bu cok onemli bunda bitiyor hersey review this 
	    int j = i ;
	    j = 100 ; 
	    
	    System.out.println(i);
	    
	    for (Integer each : list4) {
	      each = 100 ; 
	      System.out.println("Item : " + each);
	    }
	    
	    for (int x = 0; x < list4.size(); x++) {
	      
	      Integer each = list4.get(x); 
	      each = 100 ; 
	      System.out.println("Item : " + each);
	      
	    }
	    
	    
	    
	    
	    
//	    for (int x = 0; x <list4.size(); x++) {
	//  
//	      System.out.println();
	//
//	    }
	    
	    
	    
	    
	    
	    
	    
	    

	  }

	}