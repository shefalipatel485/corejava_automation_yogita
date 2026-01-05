package Basics;

import java.util.Scanner;

public class User_defined {
public static void main(String[] args) {
	//scanner class is used to create dynamic value
	//create scanenr class
	Scanner scn=new Scanner(System.in);
	System.out.println("enter student id");
	//nextInt()=>used to take int val at runtime
	int id=scn.nextInt();
	System.out.println("Enter student name");
	String name=scn.next();
	System.out.println("enter student marks");
	Double marks=scn.nextDouble();	
	System.out.println(id+"\n"+name+"\n"+marks);
	
	
}
}
