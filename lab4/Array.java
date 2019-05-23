import java.util.*;
class Array{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check either it belong to array or not");
		int f=sc.nextInt();
		int []num={1,2,3,4,5};
		boolean found=false;
		for(int n:num)
			if (n==f)
			{
				found=true;

			}
			if(found){
				System.out.print("Number"+f+"exists in array");

			}
			else{
				System.out.print("Number"+f+"Not Found");
	}
	}
}