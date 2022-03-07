package day4;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Class Name : ");
		String className = sc.next();
		try {
			Class temp = Class.forName(className);
			System.out.println("Class Exists");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Class does not exist check the name of the class");
		}
		new Thread(() -> System.out.print("Functional Interface in java library")).start();
	}
}
