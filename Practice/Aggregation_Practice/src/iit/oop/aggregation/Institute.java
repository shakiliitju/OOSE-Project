package iit.oop.aggregation;

import java.util.List;

public class Institute {
	private int instituteId;
	private String InstituteName;
	private List<Department> departments;
	Institute(int instituteId, String instituteName, List<Department> departments) {
		this.instituteId = instituteId;
		InstituteName = instituteName;
		this.departments = departments;
	}
	 public int getTotalStdntsNumInIns() {
	 	int noOfStudents=0;
	 	List<Student> students;
	 	
	 	for(Department dept:this.departments) {
	 		students = dept.getStudents();
	 		noOfStudents+= students.size();
	 	}
	 	return noOfStudents;
	}
	 public void getTotalStdntsNumWithDeptInIns() {
		 	List<Student> students;
		 	
		 	for(Department dept:this.departments) {
		 		students = dept.getStudents();
		 		System.out.println("Department Name: " 
		 		+ dept.getDepartmentName()+ "  " +
		 		"Students: " +students.size());
		 	
		 	}
		}
	
	
	
}
