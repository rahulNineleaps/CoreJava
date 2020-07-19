package DynamicDispatch;

import java.io.IOException;

class A3 {
	public void show() throws IOException {
		System.out.println("show a");
	}

	class B3 extends A3 {
		/*
		 * public void show() throws Exception{
		 * 
		 * }
		 */
	}
//Exception scope cannot be broader in overriding class 
}

class C3 extends A3 {
	public void show() {

	}
	// not declaring throws is ok though
}

public class DynamicDispatch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
