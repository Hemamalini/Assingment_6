package assingment6;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		int[] val1= {3,2,11,4,6,7};
		int[] val2={1,2,8,4,9,7};
		
		List<Integer> listObj1 = new ArrayList<Integer>();
		for (Integer integer1 : val1) {
			listObj1.add(integer1);
			
		}
		
		List<Integer> listObj2 = new ArrayList<Integer>();
		for (Integer integer2 : val2) {
			listObj2.add(integer2);
			
		}
		
		for (Integer integer3 : listObj1) {
			if(listObj2.contains(integer3) == true) {
				System.out.println(integer3);
			}	
		}
	}
}