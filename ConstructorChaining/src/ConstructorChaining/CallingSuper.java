package ConstructorChaining;

//OCJP question on constructor chaining needs to be solved 
class Base {
	String name;

	Base() {
		// this("");
		System.out.println("in base no argument Constructor");
	}

	/*
	 * Base(String s) { this.name = s;
	 * System.out.println("in base of argument Constructor ::" ); }
	 */
}

class Derived extends Base {

	public Derived() {
		System.out.println("in no argument constructor of derived ");
	}

	public Derived(String s) {
		// this();
		System.out.println("argument constructor of derived ");
	}
}

public class CallingSuper {

	public static void main(String[] args) {
		Derived d = new Derived("rahul");
	}

}
//we need to define implicit base when we override the constructor , 
//in general compiler provide implicit parent class constructor if we donot overload constructor 
//child class constructor if overridden doesnot need no argument constructor 

/*
 * Program ::
 * 
 * 
 * class Base { String name;
 * 
 * Base() { this(""); System.out.println("in base no argument Constructor"); }
 * 
 * Base(String s) { this.name = s;
 * System.out.println("in base of argument Constructor ::" ); } }
 * 
 * class Derived extends Base { public Derived() {
 * System.out.println("in no argument constructor of derived "); }
 * 
 * public Derived(String s) { this();
 * System.out.println("argument constructor of derived "); } }
 * 
 * public class CallingSuper {
 * 
 * public static void main(String[] args) { Derived d = new Derived("rahul"); }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * o/p in base of argument Constructor :: in base no argument Constructor in no
 * argument constructor of derived argument constructor of derived
 */
