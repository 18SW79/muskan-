class AddArray{
	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{10,20,30},{40,50,60},{70,80,90}};
		int c[][]=new int [3][3];
		for (int m=0;m<3 ;m++ ) {
			for (int n=0;n<3 ;n++ ) {
				c[m][n]=a[m][n]+b[m][n];
				System.out.print(c[m][n]+ " ");
				
			}
			System.out.println();
		}
	}
}