package ch01;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.studentID=12345;
		studentLee.studentName="sunsin";
		studentLee.address = "Seoul";
		studentLee.showStudentInfo();
		System.out.println(studentLee);
		
	}
	
}
