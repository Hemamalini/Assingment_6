package assingment6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {
public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> listObj = new ArrayList<Integer>();
		for (Integer eachVal : arr) {
			listObj.add(eachVal);	
		}
		Set<Integer> setObj = new HashSet<Integer>();
		for (Integer eachVal : listObj) {
			boolean addVal = setObj.add(eachVal); 
			if(addVal==false) {
				System.out.println(eachVal + " is duplicated");
				}
		}
		
		
	}
}

