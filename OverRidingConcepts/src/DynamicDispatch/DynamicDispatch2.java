package DynamicDispatch;

class A1 {
	public void run1() {
		System.out.println("running 1");
	}
}
class B1 extends A1{
	public void run1() {
		System.out.println("running 1b");
	}
	public void run2() {
		System.out.println("running 2b");
	}
}
public class DynamicDispatch2 {
	public static void main(String args[]) {
		A1 b= new B1();
	     b.run1();
	     //run2 cannot be called , it will give compile time exception 
	    // b.run2();
	}
     
}
