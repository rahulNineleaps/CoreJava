package DynamicDispatch;
//OCJP question needs to be solved 
class A {
	int val = 1;

	public void display() {
		System.out.println("in class A");
	}
}

class B extends A {
	int val = 2;

	public void display() {
		System.out.println("in class B");
	}
}

public class DynamicDispatch1 {

	public static void main(String[] args) {
		A a = new B();
		a.display();
		System.out.println(a.val);
	}

}
/*
 *RULES OF OVERRIDING IN JAVA 
 *1>In java, a method can only be written in Subclass, not in same class.
 *2>The argument list should be exactly the same as that of the overridden method
 *3>The return type should be the same or a subtype (covariance)of the return type declared 
 *  in the original overridden method in the super class.
 *4>The access level cannot be more restrictive
 *5>A method declared final cannot be overridden.
 *6>A method declared static cannot be overridden but can be re-declared.
 *7>A subclass within the same package as the instance’s superclass can override any superclass 
 *  method that is not declared private or final.
 *8>An overriding method can throw any uncheck exceptions
 *9>overriding method should not throw checked exceptions that are new or broader 
 *  than the ones declared by the overridden method.    
 * */
 