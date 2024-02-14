package iit.oop.aggregation;

import java.util.List;

public class Department {
	private int departmentId;
	private String departmentName;
	private List<Student> students;
	
	Department(int departmentId, String departmentName, List<Student> students) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.students = students;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}

	public List<Student> getStudents() {
		return students;
	}	
}
