class Student{
	private int age;
	private String name;
	private String address;
	public Student(int age, String name,String address){
		this.age=age;
		this.name=name;
		this.address=address;
	}
	public void showInfo(){
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("address: "+address);
	}
}
class UseStudent{
 public static void main(String args[]){
 Student s1=new Student(79,"MUSKAN MEMON","HALA NEW");
 Student s2=new Student(10,"AHMAN MEMON","city HALA NEW");
 Student s3=new Student(20,"MUSTAN MEMON","HALA OLD");
 Student s4=new Student(30,"EISHA","KARACHI");
 Student s5=new Student(50,"MUHAMMAD SULEMAN","hyderabad");
 Student[] std={s1,s2,s3,s4,s5};
 for(int i=0;i<std.length;i++){
 	std[i].showInfo();
 }
 }
 }