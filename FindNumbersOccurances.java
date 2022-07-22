package assingment6;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {
public static void main(String[] args) {
	int[] arr = {2,3,5,6,3,2,1,4,2,1,6,-1};
	Map<Integer,Integer> mapObj = new TreeMap<Integer,Integer>();
	
	for (int eachVal : arr) {
		//System.out.println("eachVal : "+eachVal);
		if(mapObj.containsKey(eachVal)){
			//System.out.println("eachVal : "+eachVal +" : "+mapObj.containsKey(eachVal)+" : get : "+mapObj.get(eachVal));
			mapObj.put(eachVal, mapObj.get(eachVal)+1);
		} else {
			//System.out.println("eachVal : "+eachVal +" : "+mapObj.containsKey(eachVal));
			mapObj.put(eachVal, 1);
		}
    }
	System.out.println("mapObj : "+mapObj);
	}
}


/*
 * Input array numbers, each occurances
 * 
 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
 * 
 * Order: Ascending Order
 * 
 */

/*
 * Psuedcode:
 * 
 * 1) Create Map -> TreeMap
 * 2) For loop -> each number -> add to the map
 * 3) If it is exist -> update it with + 1
 * 	  Else -> new entry with 1 as value
 * 
 */