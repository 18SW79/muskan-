class Task1part1{
	public static void main(String[] args) {
		int x=1;
		for (int i=1;i<=5 ;i++ ) {
			for (int j=5;j>=i ;j-- ) {
				System.out.print(" ");
			}
			for (int k=1;k<=x ;k++ ) 
			{
				System.out.print("*");
			}
			x=x+2;	
	
			System.out.println();
		}
	}
}