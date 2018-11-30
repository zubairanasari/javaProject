package learn.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class ForeachMap {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "Monkey");
	      hmap.put(2, "Dog"); 
	      hmap.put(3, "Cat");  
	      hmap.put(4, "Lion");   
	      hmap.put(5, "Tiger");   
	      hmap.put(6, "Bear");
	      
	      hmap.forEach((key,value)->System.out.println(key+" : "+value));
	      
	      hmap.forEach((key,value)->{
	    	  if(key == 4) {
	    		  System.out.println(value);
	    	  }
	      });
	      
	      hmap.forEach((key,value)->{
	    	  if("Cat".equals(value)) {
	    		  System.out.println("Key for Cat is : "+key);
	    	  }
	      });
	      
	      List<String> fruits = new ArrayList<String>();
	      fruits.add("Apple");
	      fruits.add("Orange");
	      fruits.add("Banana");
	      fruits.add("Pear"); 
	      fruits.add("Mango");
	      
	      fruits.forEach(str->{
	    	  if(str.length()>5) {
	    		  System.out.println(str);
	    	  }
	      });
	      
	      /*String names = "abcdefgabcdkdiejdafjauerdfdjk";
	      
	      Map<String, Long> map =
	    	      names.stream().collect(
	    	          Collectors.groupingBy(
	    	             Function.identity(), Collectors.counting()
	    	          )
	    	      );

	    	      System.out.println(map);*/
	      
	      StringJoiner mystring = new StringJoiner("-");    
          
	        // Joining multiple strings by using add() method  
	        mystring.add("Logan");  
	        mystring.add("Magneto");  
	        mystring.add("Rogue");  
	        mystring.add("Storm"); 
	        
	        System.out.println(mystring);
	        
	        StringJoiner mystring1 = new StringJoiner(",", "(", ")");    
	          
	        // Joining multiple strings by using add() method  
	        mystring1.add("Negan");  
	        mystring1.add("Rick");  
	        mystring1.add("Maggie");  
	        mystring1.add("Daryl");  
	                  
	        // Displaying the output String
	        System.out.println(mystring1);
	        
	        int numbers[] = {22, 89, 1, 32, 19, 5};
	    	/* Specifying the start and end index. The start index is
	    	 * 1 here and the end index is 5. which means the the elements
	    	 * starting from index 1 till index 5 would be sorted.
	    	 */
	    	Arrays.parallelSort(numbers, 1, 6);
	    	//converting the array to stream and displaying using forEach
	    	Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
	    	
	    	Arrays.parallelSort(numbers);
	    	//converting the array to stream and displaying using forEach
	    	Arrays.stream(numbers).forEach(n->System.out.print("\n"+n+" "));
	}

}
