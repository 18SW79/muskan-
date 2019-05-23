class LargeArray{
	public static void main(String[] args) {
		int []arr={9,3,7,1};
		int max=arr[0];
		for (int m=0;m<arr.length ;m++ ) {
			if(max<arr[m])
				max=arr[m];
			System.out.println("largest=" +max);
			
		}
	}
}