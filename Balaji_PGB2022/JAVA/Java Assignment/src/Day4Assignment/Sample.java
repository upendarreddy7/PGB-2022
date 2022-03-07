package Day4Assignment;
import java.util.*;
public class Sample {
    public static void main(String argss[])
    {
    	Scanner in=new Scanner(System.in);
    	//Taking Input From Console
    	String str=null;
    	try
    	{
    	str=in.next();
    	if(str.equals(null)) throw new NullPointerException("Error caught");
    	int sum=0;
    	/*for(int i=0;i<str.length();i++)
    	{
    		//Separating string to integers and summing up
    		sum+=Integer.parseInt(str.charAt(i)+"");
    	}
    	// Printing the Sum
    	System.out.println("Sum of two integers is:"+sum);
    	}
    	catch(NullPointerException e1)
    	{
    		System.out.println("Null Pointer Exception Caught");
    	}*/}
    	catch(NumberFormatException e2)
    	{
    		System.out.println("Number Format Exception Caught");
    	}
    }
}
