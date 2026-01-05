package OOPS;
public class class_objects {	
	//method has 4 types
	//no return no parameter
	void test() 
	{
		int num=-10;
		if(num>0)
		{
		System.out.println("num is positive num"+num);
		}
		else {
			System.out.println("num is negative num"+num);
		}		
	}
	//no return no parameter
	void test1() {
		//print  0 to 20 value using for loop
		for(int i=0;i<=20;i++)
		{			
			System.out.println(i);
		}
	}	
public static void main(String[] args) {
	//object creation
	class_objects obj=new class_objects();
	obj.test();
	obj.test1();
	
}
}
