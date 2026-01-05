package Basic;

import java.util.Scanner;

//make nested switch case program
public class Switchcase_program {
public static void main(String[] args) {	
	int empId=102;
	String dept="CPP";
	Scanner sc=new Scanner(System.in);
	int salary=0;
	switch(empId) 
	{
	case 101:
		System.out.println("Emp Name: John");
		break;
	case 102:
	System.out.println("Emp Name: Alice");
			switch(dept) 
			{
			case "HR":
				System.out.println("Department: Human Resources");
				System.out.println("enter salary:");
				salary=sc.nextInt();
				System.out.println("Salery is "+salary);
				break;
			case "IT":
				System.out.println("Department: Information Technology");
				System.out.println("enter salary:");
				salary=sc.nextInt();
				System.out.println("Salery is "+salary);
				break;
			case "CPP":
				System.out.println("Department: C++ Development");
				System.out.println("enter salary:");
				salary=sc.nextInt();
				System.out.println("Salery is "+salary);
				break;
			default:
				System.out.println("Department: Unknown");
			}
			break;
			
		default:
			System.out.println("invalid employee num");
	}
	
}
}
