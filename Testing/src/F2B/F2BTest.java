package F2B;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


import org.junit.Test;

public class F2BTest {

	public static void main(String args[]) 
    { 
       
		List<Integer> givenList = Arrays.asList(1, 6, 10);
		ArrayList<Integer> givenList2= new ArrayList<Integer>();
		givenList2.add(1);
		givenList2.add(10);
		givenList2.add(6);
//		 //Random manier 1
//        Random random1 = new Random();
//  
//        // Output is different everytime this code is executed 
//
//        int randomElement = givenList.get(random1.nextInt(givenList.size()));
//        System.out.println(randomElement); 
//        
//        //random Manier 2
      Integer random2 = (int) (Math.random() * 10); 
//      
//      int distance = Math.abs(givenList2.get(0) - random2);
//      int idx = 0;
//      for(int c = 1; c < givenList2.size(); c++){
//          int cdistance = Math.abs(givenList2.get(c) - random2);
//          if(cdistance < distance){
//              idx = c;
//              distance = cdistance;
//          }
//      }
//      int theNumber = givenList2.get(idx);
//      
//      System.out.println(theNumber);
//      
      //random Manier 3
      System.out.println("Manier3:");
      ArrayList<Integer> givenList3= new ArrayList<Integer>();
      givenList3.add(1);
      givenList3.add(3);
      givenList3.add(10);
      System.out.println(givenList3);
      for(int p = 0; p < 1000; p++) {
	      Double random3 = Math.random() * 10; 
	      int lagerdan = 0;
	      boolean gevondenlager = false;
	      for(int c = 0; c < givenList3.size(); c++){
	    	  if(givenList3.get(c) > random3 && gevondenlager == false){
	    		  lagerdan = givenList3.get(c);
	    		  gevondenlager = true;
	    	  }
	    	  
	          
	      }
	      System.out.println("Random:" + random3 + " " + "nummer:" + lagerdan);
      }
    } 
	
}
