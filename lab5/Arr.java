import java.util.*;
class Arr{
	int a[]=new int[5];
	public void PopulateArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements= ");
		for (int i=0;i<5 ;i++ ) {
			a[i]=sc.nextInt();
			}
		}
			public void display()
			{
				System.out.println("EVEN NUMBERS:");
				for (int i=0;i<5 ;i++ ) {
					if (a[i]%2 !=0)
					continue;
					System.out.println(a[i]+ " ");
					}
					System.out.println();
					System.out.println("ODD NUMBERS: ");
					for (int i=0;i<5 ;i++ ) {
						if (a[i]%2 ==0)
						continue;
						System.out.println(a[i] +" "); 
						}
						
					}
				}
				class Ar{
					public static void main(String[] args) {
						Arr a1=new Arr();
						a1.PopulateArray();
						a1.display();
					}
				}
			

	
