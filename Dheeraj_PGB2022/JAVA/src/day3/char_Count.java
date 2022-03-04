package day3;

import java.util.*;

public class char_Count {
	
	public static String count(String s) {
		Map<Character, List<Integer>> dict = new HashMap<>();
		s = s.replaceAll(" ", "");
		for (int i = 0; i < s.length(); i++) {
			char id =  s.charAt(i);
		    if (dict.containsKey(id)) {
		        dict.get(id).add(i);
		    } else {
		        dict.put(id, new ArrayList<Integer>());
		        dict.get(id).add(i);
		    }
	        // System.out.print(s.charAt(i) + " ");
	    }
		return dict.toString();
	}
	
	public static void main(String[] args) {
        List<String> slist=new ArrayList<>();
        slist.add("Dheeraj");
        slist.add("Akhil");
        slist.add("Anvesh");
        slist.add("Balaji");
        
        for (String name : slist) {
            System.out.println(count(name));
        }
		
	}
	
}
