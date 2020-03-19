import java.util.ArrayList;

public class Course {
	String CourseCode;
	ArrayList<Student> EnrolledStudents;
	int StudentCount;
	int Capacity=0;


	public Course(String courseCode, int capacity) {
		CourseCode = courseCode;
		Capacity = capacity;
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public String getCourseCode() {
		return CourseCode;
	}
	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	public int getStudentCount() {
		return StudentCount;
	}
	public void setStudentCount(int studentCount) {
		StudentCount = studentCount;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}
	public void AddStudent (Student student) {
		if(Capacity==StudentCount) {
			System.out.println("Capacity is full");
		}
		else {
			EnrolledStudents.add(student);
			StudentCount++;
		}

	}
	public void CalculateCourseAvg ( ) {
		double sum=0;
		for(int i=0; i<EnrolledStudents.size(); i++) {
		sum+=EnrolledStudents.get(i).GetGradeOf(CourseCode);
		}
		double avg=sum/StudentCount;
	}
	public  String toString( ) {
		return "";	} 

}




