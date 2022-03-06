package day4;
import day3.*;

import java.util.Scanner;

final class InvalidNameException extends Exception {
	public InvalidNameException(String str) {
		 System.out.println(str); 
	}
};

public class custom_input extends Training{
	static Scanner input = new Scanner(System.in); 
	
	static void validate(String name) throws InvalidNameException{    
		if(name.length() <= 2){  
			System.out.println("'"+name+"'");
			throw new InvalidNameException("Invalid Name!! Try again");
	    }
	}    
	
	static void Employee_data() throws InvalidNameException {
	    System.out.print("Enter Name : ");
	    String name = input.nextLine();
	    validate(name);
	    System.out.print("Enter ID : ");
	    int id = Integer.parseInt(input.nextLine());
	    int sno = Training.add_Employee_to_list(id, name);
	    System.out.println("Added");
	    Training.print_Employeelist();
	    Training.Employeelist.get(sno).assigntask("Test");
	    Training.Employeelist.get(sno).listTasks();
	}
	
	public static void main(String[] args) {
	    for(int i = 0;i<30;i++) {
	    	try {
	    		Employee_data();
	    	} 
	    	catch (NumberFormatException e) {
	    		System.out.println("Enter a valid ID!!");
	    	}
	    	catch (InvalidNameException e) {
	    		continue;
	    	}
	    }
	}
}
