package Task1;

// Interface Class
interface vehicle {
	
	// Declare 2 methods in interface
    String name(String name);
    void type(String type);
}
  
// Abstract class
abstract class Car {
	
	// Add method with definition in abstract class
    public String name(String name){
    	System.out.println("This won't be printed");
        return name;
    }
    public String color() {
    	// System.out.println("Color is Red");
    	return "Red";
    }
}
  
// Concrete class
class Main extends Car implements vehicle{
	
	// Implements methods of Interface class in concrete class
	public void type(String type) {
		System.out.println("4 - wheeler");
	}
	
    // Override the methods of abstract Class in concrete class
    public String name(String name){
        // System.out.println("Car Name : "+name);
    	return name;
    }
    
    public int mileage(int m) {
    	System.out.println("Mileage : "+m);
    	return m;
    }
  
    public static void main(String args[])
    {
    	// Create objects of concrete class
        Main cc = new Main();
        System.out.println("Type : " + cc.name("BMW"));
        
        // Access the Abstract class methods
        System.out.println("Color : " + cc.color());
  
        // Access the Concrete class methods
        System.out.println("Mileage by accessing concrete class method : " + cc.mileage(30));
    }

}
