package assingment6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MostDuplicate {
	public static void main(String[] args) {
		String textVal = "abbabc";
		int maxValue = 0;
		Map<Character,Integer> mapObj = new HashMap<Character,Integer>();
		for(int i =0;i<textVal.length();i++) {
			char charVal = textVal.charAt(i);
			//System.out.println(charVal);
			if(mapObj.containsKey(charVal)) {
				mapObj.put(charVal, mapObj.get(charVal)+1);
			}else {
				mapObj.put(charVal, 1);
				

			}
		}
		List<Integer> listObj = new ArrayList<Integer>(mapObj.values());
		for(int j =0;j<listObj.size()-1;j++) {
			
			if(listObj.get(j)>listObj.get(j+1)) {
				maxValue=listObj.get(j);
			}else {
				maxValue=listObj.get(j+1);
			}
		}

		for(Entry<Character, Integer> entryObj: mapObj.entrySet()) {
			if(entryObj.getValue()==maxValue) {
				System.out.print("output: "+entryObj.getKey());
			}
        }
	}
}