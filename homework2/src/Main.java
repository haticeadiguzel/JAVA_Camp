
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.setId(1);
		student1.setFirstName("Hatice");
		student1.setLastName("Adıgüzel");
		student1.setEmail("adiguzel.hatice@gmail.com");
		student1.setPassword("********");
		
		System.out.println(student1.getFirstName() +" "+ student1.getLastName());
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.signUp();
		
		studentManager.signIn();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.a();
		instructorManager.b();
		instructorManager.c();
		
		
		
		
		
		

	}

}
