import java.util.Scanner;
class Arthematic{
	public static void main(String args[]){
	int num1=0,num2=0;
	char operator;
	int answer=0;
	double c=0;
	Scanner input= new Scanner(System.in);
	System.out.println("enter the first number");
	num1=input.nextInt();
	System.out.println("enter the second number");
	num2=input.nextInt();
	System.out.println("Select the arthematic operator '+' \n '-'\n '*'\n '/' ");
	operator=input.next().charAt(0);
	switch(operator){
		case '+':
		answer=num1+num2;
		break;
		case '-':
		answer=num1-num2;
		break;
		case '*':
		answer=num1*num2;
		break;
		case '/':
		answer=num1/num2;
		break;
		default:
		    System.out.print("you Select wrong operator");}
		    if (operator!='/') {
			System.out.println("answer:" +answer);
		}
		else 
		{
			System.out.println("answer:" +c);
		}
	}
}
