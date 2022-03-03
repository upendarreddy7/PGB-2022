import java.util.*;
class student{
	String name;
	int rollno;
	int marks;
	public student(){
		name="nithish";
		rollno=1;
		marks=50;
	}
	public student(String name,int rollno,int marks){
		name=this.name;
		rollno=this.rollno;
		marks=this.marks;
	}
	public static set(int marks){
		marks=this.marks;
	}
	public static get(){
		System.out.println(marks);
	}
	
	public hashCode(){
		return this.rollno;
	}
	public static void main(String[] args){
		student obj=new student("abc",2,60);
		obj.set(80);
		System.out.println(obj.get())
	}
}
