package assingment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//String declaration
		String text = "We learn java basics as part of java sessions in java week1";
		String concatValue="";
		String textSpace= " ";
		
		//To remove duplicate use set and split using space
		Set<String> setObj = new LinkedHashSet<>();
		String[] splitString = text.split("\\s+");
		
		//add splitted value into set which remove duplicate
		for(int i =0;i<=splitString.length-1;i++) {
			setObj.add(splitString[i]);
		}
		
		//now caoncat the value using space
		for (String eachValue : setObj) {
			concatValue=concatValue+textSpace+eachValue;
		}
		System.out.println(concatValue);

	}
}
