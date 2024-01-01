package iit.uni.model;

public class Student {
	
	private int student_id;
	private String student_name;
	private int age;
	private boolean stutas;
	
	
	public Student()
	{
		
	}
	
	public Student(int student_id, String student_name, int age, boolean stutas) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.age = age;
		this.stutas = stutas;
	}



	public int getStudent_id() {
		return student_id;
	}
	
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isStutas() {
		return stutas;
	}
	public void setStutas(boolean stutas) {
		this.stutas = stutas;
	}
	

}
