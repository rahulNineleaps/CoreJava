package DynamicDispatch;

class A2 {
	public void show() throws ArrayIndexOutOfBoundsException {
		System.out.println("display");
	}
}

class B2 extends A2 {
	public void show() throws IndexOutOfBoundsException {
		System.out.println("show");
	}
}

public class DynamicDispatch3 {

	public static void main(String[] args) {
		A2 a = new B2();
		a.show();
	}

}

//this will run fine as they are not checked Exception