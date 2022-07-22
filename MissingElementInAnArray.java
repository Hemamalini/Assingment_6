package assingment6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		int indexOfVal = 0;
		Set<Integer> setObj = new TreeSet<Integer>();
		for (Integer eachVal : arr) {
			setObj.add(eachVal);
			//System.out.println(setObj);	
		}
		List<Integer> listObj = new ArrayList<Integer>(setObj);
		for (Integer integer : listObj) {
			indexOfVal = listObj.indexOf(integer);
			//System.out.println(indexOfVal);
			
			if(listObj.contains(indexOfVal)==false) {
				System.out.println(listObj.get(indexOfVal));
				break;
			}
			
		}
			
		
		
		
	}
}
