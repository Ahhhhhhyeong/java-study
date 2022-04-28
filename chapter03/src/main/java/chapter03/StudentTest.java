package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setGrade(1);
				
		Person p1 = s1; 			// upcasting(암시적): 자식을 부모로 캐스팅
		p1.setName("sss");
		
		Student s2 =(Student)p1; 	// downcasting(명시적), Explicity
		s2.setMajor("cs");
	}

}
