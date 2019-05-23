import java.util.*;
class Integer{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int j=0;
		for (int i=1;i<=n ;i++ ) {
			System.out.println("enter number :");
			j=sc.nextInt();
			j+=j;
			System.out.println("sum=" +j);		
		}
	}
}