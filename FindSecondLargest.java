package assingment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		Set<Integer> setObj = new TreeSet<Integer>();
		//add value to the tree set
		for (Integer eachVal : data) {
			setObj.add(eachVal);
		}
		List<Integer> listObj = new ArrayList<Integer>(setObj);
		//find length
		int sizeVal = setObj.size();
		//print FindSecondLargest number
		System.out.println(listObj.get(sizeVal-2));
	}
}
