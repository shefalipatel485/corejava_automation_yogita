package Basics;

public class patterns {
public static void main(String[] args) {
	
	//reverse loop
	for(int i=5;i>=1;i--)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
	}
	
	
	//A
	//B C
	//D E F
	char ch='A';
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=i;j++)
		{
			
			System.out.print(ch+" ");
			ch++;
			
		}
		System.out.println();
	}
	//	
	
	//pyramid pattern
	
	for(int i=1;i<5;i++)
	{
		//spaces
		for(int j=i;j<5;j++)
		{
			System.out.print(" ");
		}
		//pyramid stars
		for(int k=1;k<=(2*i-1);k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	//Print even and odd numbers from 1 to 50

}
}
