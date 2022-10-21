package Lab6;

public class Student {
	int regNo;
	int marks;
	public Student(){}
	public Student(int regNo, int marks) {
		super();
		this.regNo = regNo;
		this.marks = marks;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
