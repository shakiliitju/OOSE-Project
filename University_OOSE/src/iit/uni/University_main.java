package iit.uni;

import iit.uni.model.Student;
import iit.uni.model.Teacher;

public class University_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student();
		student1.setAge(24);
		
		System.out.println(student1.getAge());
		
		Teacher teacher = new Teacher();
		teacher.setTeacher_name("Anannaya");
		System.out.println(teacher.getTeacher_name());
		

	}

}
