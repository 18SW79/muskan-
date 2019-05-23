class CombinedClass{
	Student s;
	Marksheet m;
	public CombinedClass(Student s,Marksheet m){
		this.s=s;
		this.m=m;
	}
	public void createStudentResult(){
		s.showData();
		System.out.println("Total marks= "+m.getTotalMarks());
		System.out.println("obtained marks= "+m.getObtainedMarks());
		System.out.println("percentage= "+m.getPercentage());
		if (m.getGrade(m.getPercentage())!=0) {
			System.out.println("Grade: "+m.getGrade(m.getPercentage()));
		}
		else {
			System.out.println("Grade: FAIL");
		}
	}
}
class MainClass{
	public static void main(String[] args) {
		Student s=new Student("MUSKAN MEMON",18);
		Marksheet m=new Marksheet(2.2,3,4.9);
		s.setData(79,"SOFTWARE",18,"MUET");
		CombinedClass cc=new CombinedClass(s,m);
		cc.createStudentResult();
	}
}