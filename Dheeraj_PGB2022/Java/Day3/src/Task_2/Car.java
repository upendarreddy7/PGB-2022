package Task_2;
import java.util.*;

public class Car {
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("BMW");
		names.add("Audi");
		names.add("RRR");
		
		Set<String> color=new HashSet<>();
		color.add("Red");
		color.add("Blue");
		color.add("Cyan");
		color.add("Grey");
		
		Map<String, String> model = new HashMap<String, String>();
        model.put("BMW", "Grey");
        model.put("Audi", "Blue");
        model.put("RRR", "Red");
		
       // System
        for (String name : names)
            System.out.println(name);
        
        for (String s : color)
            System.out.println(s);
        
        for (Map.Entry m : model.entrySet())
        	System.out.println(m.getKey() + " " + m.getValue());
        
        
        
        
        
        
	}
	

}
