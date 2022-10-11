package ch01;
//클래스 이름이랑 파일 이름은 같아야함!
public class Student {
	int studentID;
	int studentNumber;
	String studentName;
	int majorCode;
	String majorName;
	int grade;
	String address;
	public void showStudentInfo() {
		System.out.println(studentID + "student name is"+ studentName + "and addrss is "+ address);
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
