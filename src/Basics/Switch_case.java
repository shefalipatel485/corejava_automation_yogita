package Basics;

public class Switch_case {	
	public static void main(String[] args) {
		int a=10,b=20;
		char ch='3';
		switch (ch) {
		case '+':
			System.out.println("Addition is "+(a+b));			
			break;

		case '-':
			System.out.println("subtration is "+(a-b));			
			break;
		case '*':
			System.out.println("Multiplication is "+(a*b));			
			break;
		case '/':
			double d=a/b;
			System.out.println("Division is "+d);		
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}
		
		
		
		
	}
	//create switch case to print week days
}
