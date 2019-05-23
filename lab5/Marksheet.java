class Marksheet{
	int java;
	int cpp;
	int maths;
	int result;
	double percent;
	public void totalmarks(){
		result=java+cpp+maths;
		System.out.println("result= "+result);
	}
	public void percentage(){

		percent=result*100/300;
		System.out.println("percentage= "+percent);
	}
	public void grade(){
		if (percent>90)
		System.out.println("grade=A");
		else if(percent>=80 && percent<=90)
		System.out.println("grade=B");
	else if(percent>=70 && percent<80)
		System.out.println("grade=C");
	else if(percent>=60 && percent<70)
		System.out.println("grade=D");
	else if(percent<60)
		System.out.println("FAIL");
}
	}
class Mark{
	public static void main(String[] args) {
		Marksheet m1=new Marksheet();
		m1.java=85;
		m1.cpp=90;
		m1.maths=95;
		m1.totalmarks();
		m1.percentage();
		m1.grade();
	}
}
