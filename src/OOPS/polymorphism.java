package OOPS;
//polymorphism is defines as one method name with different forms
//2 types of polymorphism
//compile time polymorphism (method overloading)
//run time polymorphism (method overriding)

//method overloading: when method name is same with different parameters within the same class

public class polymorphism {
	void add() {
		System.out.println("no parameter method");
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(String str) {
		System.out.println(str);
	}
	
public static void main(String[] args) {
	polymorphism obj=new polymorphism();
	obj.add();
	obj.add(10);
	obj.add(10, 20);
	obj.add("yogita");
}
}
