package Basic;
//switchcase use to execute one block of code among multiple options
public class Switchcase {
public static void main(String[] args) {	
int a=10,b=20;
char op='6';
	switch(op) 
	{	
	case '+':
	System.out.println("Addiiton is "+(a+b));
	break;
	case '-':
	System.out.println("subtraction  is "+(a-b));
	break;	
	case '*':
	System.out.println("multiplication is "+(a*b));
	break;		
	default:
	System.out.println("Invalid operator");
	}
	
	
}
}
