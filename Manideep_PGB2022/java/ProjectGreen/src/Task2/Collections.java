package Task2;
import java.util.*;
public class Collections {
	public static void main(String args[])
	{
		System.out.println("List Collection");
		List<String> l=new ArrayList<String>();
		l.add("A");  
		l.add("B");  
		l.add("C");
		 for(String alpha:l)
		  System.out.println(alpha);
			System.out.println("Hash Map Collection");
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(65,"A"); 
		   map.put(66,"B");    
		   map.put(67,"C");   
		   map.put(68,"D");   
		       
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   } 
		   
		   System.out.println("Hash Set Collection");
		   HashSet<String> s=new HashSet();  
           s.add("A");    
           s.add("B");    
           s.add("C");   
           s.add("D");  
           s.add("E");  
           Iterator<String> i=s.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
		}  	
}
