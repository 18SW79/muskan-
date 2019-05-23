import java.util.*;
class MarkSheet{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("please enter marks in c++");
	int num1 = sc.nextInt();
	System.out.println("please enter marks in Data structures");
	int num2= sc.nextInt();
	System.out.println("please enter marks in Operating System");
	int num3= sc.nextInt();
	int Obmarks= num1+num2+num3;
	int Tmarks=300;
	System.out.println("Total marks are:" +Obmarks);
	float per=(float)(Obmarks*100)/Tmarks;
	
	System.out.println("percentage:" +per);
	if(per>90){
	System.out.println("grade A");
	}
	if(per<=90 && per>=80){
	System.out.println("grade B");
	}
	if(per<=79 && per>=70){
	System.out.println("grade C");
	}
	if(per<=69 && per>=60){
	System.out.println("grade D");
	}
	if(per<60){
	System.out.println("FAIL");
	}
	}
}