class Task1{
	public static void main(String[] args)
	{
		String name="Muskan Memon";
		int marks1st=500;
		long marks2nd=650;
		int total1st=700;
		int totalmarks=1100; 
		float percentage1st=((marks1st*100)/700);
		float percentage2nd=((marks2nd*100)/700);
		char grade='A';
		double avgpercentage=(percentage1st+percentage2nd)/2;
		boolean pass=true;
		
		byte sem=1;
		
	System.out.println("Name of student : "+name);
	System.out.println("Semester "+sem);
	System.out.println("Marks Obtain in 1st Year "+marks1st);
	System.out.println("Total Marks in 1st Year "+total1st);
	System.out.println("Percentage in 1st year "+ percentage1st	);
	System.out.println("Marks Obtain in 2nd Year "+marks2nd);
	System.out.println("Total Marks in 2nd Year "+total1st);
	System.out.println("Percentage in 2nd Year "+ percentage2nd);
	System.out.println("Total Marks in 1st and 2nd Year "+totalmarks);
	System.out.println("Final Percentage "+avgpercentage);
	System.out.println("Grade "+grade);
	if(avgpercentage>50)
	{
		if(pass==true)
		{
			System.out.println("Final Status : Pass"			);
		}
	}

	
	
}

}