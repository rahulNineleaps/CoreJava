package ConstructorChaining;

public class ConstructorChaining1 {
	ConstructorChaining1() {
		this(5);
		System.out.println("no argument constructor called ");
	}

	public ConstructorChaining1(int i) {
		this(2, 3);
		System.out.println("one argument constructor called :"+i);
	}

	public ConstructorChaining1(int i, int j) {
		//this();
		System.out.println("2 argument constructor called "+i*j);
	}

	public static void main(String[] args) {
		ConstructorChaining1 c1 = new ConstructorChaining1();
	}

}
/*
 * Constructor chaining rule 
 * 1>this() can be used to call constructor within the class , but it has to be the first line of the constructor 
 * 2>there has to be at least one constructor without this(), if you donot do this , it will compile time error will come of 
 * recurcive invocation of constructor 
 * 
 */
