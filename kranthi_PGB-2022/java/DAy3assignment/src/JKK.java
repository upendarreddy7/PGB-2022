
public class JKK  extends Base implements Sinfo{
	public void attend() {
		System.out.println("Yes I have Attended");
	}
	public void submit() {
		System.out.println("Yes I have submitted my home work");
	}
	void fun() {
		System.out.println("Yes the activity is funny");
		
	}
	public static void main(String args[]) {
		JKK kk=new JKK();
		kk.attend();
		kk.submit();
		kk.fun();
	}

}
