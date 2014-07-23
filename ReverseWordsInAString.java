package edu.missouri.java;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {
	public static String reverseWords(String s) {
		if(s.isEmpty()){
			return "";
		}
		if(s.equals(" ")){
			return "";
		}
		s=s.trim();
		String[] array = s.split(" ");
		List<String> myList=new ArrayList<String>();
		for(int i=0;i<array.length;i++){
			if(!array[i].isEmpty()){
				myList.add(array[i]);
			}
		}
		
		if(array.length==1){
			return array[0];
		}
		if(myList.isEmpty()){
			return "";
		}
		String temp="";
		for (int i = myList.size()-1; i >= 0; i--) {
			temp=temp+myList.get(i).trim()+" ";
		}
		return temp.trim();
	}

	public static void main(String[] args) {
		String s = "    ";
		System.out.println(reverseWords(s));
	}
}
