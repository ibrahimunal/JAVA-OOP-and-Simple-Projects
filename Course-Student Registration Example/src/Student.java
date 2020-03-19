import java.util.ArrayList;

public class Student {
	ArrayList <Course> EnrolledCourses;
	ArrayList <Double> Grades;
	String Name; 
	String StudentID;

	public Student(String name, String studentID) {
		Name = name;
		StudentID = studentID;
		toString();
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	void EnrollToCourse(Course course) {
		EnrolledCourses.add(course);

	}
	void AddGradeToCourse (String courseCode, String letterGrade) {
	int courseIndex=0;
	double grade=0;
	for(int i=0; i<EnrolledCourses.size(); i++) {
		if(EnrolledCourses.get(i).getCourseCode().equals(courseCode))
		courseIndex=EnrolledCourses.indexOf(EnrolledCourses.get(i));
		
	}
	if(letterGrade.equals("AA")) {
		grade=4.0;
	}
	else if(letterGrade.equals("BA")) {
		grade=3.5;
	}
	else if(letterGrade.equals("BB"))
		grade=3.0;
	else if(letterGrade.equals("CB"))
		grade=2.5;
	else if(letterGrade.equals("CC"))
		grade=2.0;	
	else if(letterGrade.equals("DC"))
		grade=1.5;
	else if(letterGrade.equals("DD"))
		grade=1.0;
	else
		grade=0.0;
	
	Grades.set(courseIndex, grade);
		
	}
	double GetGradeOf (String courseCode) {
		Course course=new Course();
		for(int i =0; i<EnrolledCourses.size(); i++) {
			if(EnrolledCourses.get(i).getCourseCode().equals(courseCode))
				course=EnrolledCourses.get(i);
			}
		int indexOfCourse=EnrolledCourses.indexOf(course);
		return Grades.get(indexOfCourse);
	}

	public  String toString( ) {
		return " Student created : +"+ this.Name +"StudentNumber : "+this.StudentID;	} 

}
