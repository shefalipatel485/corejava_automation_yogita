package Basics;
//conditional statements in java
//1.if statement
//2.if else statement
//3.nested if else statement
//4.switch case statement

public class conditional_statement {

	public static void main(String[] args) {
		
		//check number is positive or negative
		int num=-10;
		if(num>0)
		{
		System.out.println("num is positive num"+num);
		}
		else {
			System.out.println("num is negative num"+num);
		}
		
		//check num is even or odd
		int n=16;
		if(n%2==0) {
			System.out.println("num is even num"+n);
		}
		else {
			System.out.println("num is odd num"+n);
		}
		
		
		//find largest number among 3 numbers
		int a=566;
		int b=20;
		int c=2323;
		if(a>=b && a>=c) {
			System.out.println("a is largest num"+a);
		}
		else if(b>=a && b>=c) {
			System.out.println("b is largesst num"+b);
		}
		else {
			System.out.println("c is largset num"+c);
		}
		
		
	}
}
