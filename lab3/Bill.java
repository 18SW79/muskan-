import java.util.Scanner;
class Bill{
	public static void main(String args[]){
	Scanner x= new Scanner(System.in);
	System.out.println("enter units:");
	int unit=x.nextInt();
	int bill=0;
	if(unit>300)
	{
	unit-=300;
	bill+=unit*30;
	unit=300;
	}
	if(unit<=300 && unit>200)
	{
	unit-=200;
	bill+=unit*25;
	unit=200;
	}
	if(unit<=200 && unit>100)
	{
	unit-=50;
	bill+=unit*15;
	unit=50;
	}
	if(unit<=50 && unit>0)
	{
	bill+=unit*10;
	}
	System.out.println("total bill is:" +bill);
	}
}