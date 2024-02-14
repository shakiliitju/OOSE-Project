package iit.oop.aggregation;

public class Student {
	private int studentId;
	private String studentName;
	private String department ;
	
	Student(int studentId, String studentName, String department) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}


