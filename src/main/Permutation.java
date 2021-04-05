package main;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		String s = "ABC";
		System.out.println(distinctPermutation(s));
	}

	static boolean isPresent(String s, ArrayList<String> list){
      for (String str : list){
         if (str.equals(s)) {
        	 return true;
         }
      }
      return false;
   }
	
	static ArrayList<String> distinctPermutation(String str){
	      if (str.length() == 0){
	         ArrayList<String> list = new ArrayList<>();
	         list.add("");
	         return list;
	      }
	      
	      char ch = str.charAt(0);
	      String remStr = str.substring(1);
	      ArrayList<String> prevStr = distinctPermutation(remStr);
	      
	      ArrayList<String> rem = new ArrayList<>();
	      for (String s : prevStr){
	         for (int i = 0; i <= s.length(); i++){
	            String f = s.substring(0, i) + ch + s.substring(i);
	            if (!isPresent(f, rem))
	            rem.add(f);
	         }
	      }
	      return rem;
	   }
}
