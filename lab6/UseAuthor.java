 class Author{
 	private String name;
 	private String email;
 	private char gender;
 	public Author(String name,String email,char gender){
 		this.name=name;
 		this.email=email;
 		this.gender=gender;
 	}
 	public String getName(){
 		return name;
 	}
 	public void setEmail(String email){
 		this.email=email;
 	}
 	public String getEmail(){
 		return email;
 	}
 	public char getGender(){
 		return gender;
 	}
 	public String toString(){
 		return name + "("+ gender + ") at " +email;
 	}
 }
 class UseAuthor{
 	public static void main(String[] args) {
 		Author a1=new Author("Quaid", "quaid@gmail.com", 'M');
 		System.out.println(a1);
 		a1.setEmail("quaid@gmail.com");
 		System.out.println(a1);
 		System.out.println("name is: " +a1.getName());
 		System.out.println("gender is: " +a1.getGender());
 		System.out.println("Email is: " +a1.getEmail());
 	}
 }