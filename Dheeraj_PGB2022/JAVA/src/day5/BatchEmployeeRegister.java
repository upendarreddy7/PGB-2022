package day5;
import day3.*;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EmpReg implements Runnable{
	
	int Id;
	String grp;
	List<String> givenList = Arrays.asList("A","B","C","D","E","F");
	
    public EmpReg(int id) {
        this.Id = id;
    } 
	
	public void run() {
		Random rand = new Random();
		for (int i = Id;i < Id+10;i++ ) {
			grp = givenList.get(rand.nextInt(givenList.size()));
			Training.assign_to_group(grp, i,"Employee"+i);
			System.out.println(Training.Groups.get(grp).size());
		}
	}
	

}

public class BatchEmployeeRegister{
	
	static final int MAX_T = 10;
	
	public static void main(String[] args) throws InterruptedException {
		
        Runnable r1 = new EmpReg(1001);
        Runnable r2 = new EmpReg(1011);    
        Runnable r3 = new EmpReg(1021);
          
        // creates a thread pool with MAX_T no. of 
        // threads as the fixed pool size(Step 2)
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);  
         
        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        
        // pool shutdown ( Step 4)
        pool.shutdown();  
        Thread.sleep(10);
        Training.print_group_data();
	}
}
