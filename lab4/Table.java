import java.util.*;
class Table{
	public static void main(String[] args) {
		int t,s,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Table");
		t=sc.nextInt();
		System.out.println("Enter starting Number");
		s=sc.nextInt();
		System.out.println("Enter end Number");
		e=sc.nextInt();
		int result;
		for (int i=s;i<=e ;i++ ) {
			result=t*i;
			System.out.println(t+ "x"+ i+"=" +result);
		}
	
			
		}
	}
