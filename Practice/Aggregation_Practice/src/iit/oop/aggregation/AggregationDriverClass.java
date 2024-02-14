package iit.oop.aggregation;

import java.util.ArrayList;
import java.util.List;

public class AggregationDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Department:IIT
		Student stud1 = new Student(1, "A","IIT");
		Student stud2 = new Student(2, "B","IIT");
		List<Student> iitStudents = new ArrayList<Student>();
		iitStudents.add(stud1);
		iitStudents.add(stud2);
		
		//Department:Math
		Student stud3 = new Student(3, "C","Math");
		Student stud4 = new Student(4, "D","Math");
		List<Student> mathStudents = new ArrayList<Student>();
		mathStudents.add(stud3);
		mathStudents.add(stud4);
		
		Department dept1 = new Department(1, "IIT", iitStudents);
		Department dept2 = new Department(2, "Math", mathStudents);
		List<Department> departments = new ArrayList<Department>();
		departments.add(dept1);
		departments.add(dept2);
		
		Institute institute = new Institute(1, "JU", departments);
		institute.getTotalStdntsNumWithDeptInIns();
		System.out.println("Institute has "+institute.getTotalStdntsNumInIns() + " students");
	}

}
