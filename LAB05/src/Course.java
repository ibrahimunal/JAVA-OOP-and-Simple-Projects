import java.util.ArrayList;

public class Course {
	private Instructor instructor;
	private String CourseCode;
	private String CourseName;
	private String Year;
	private String Semester;
	private int Capacity;
	int StudentCount;
	ArrayList<Student>EnrolledCourses=new ArrayList<>();
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Course(String courseCode, String courseName, String year, String semester,
			int capacity) {
		super();
		this.instructor = instructor;
		this.CourseCode = courseCode;
		this.CourseName = courseName;
		this.Year = year;
		this.Semester = semester;
		this.Capacity = capacity;
		StudentCount=0;

	}
		public Course() {
		// TODO Auto-generated constructor stub
	}

		public void AddStudent(Student student) {
			if(StudentCount==this.Capacity) {
				System.out.println(this.CourseName+" is full");
			}
			else {
				EnrolledCourses.add(student);
				StudentCount++;
			}
		}

	public String getCourseCode() {
		return CourseCode;
	}

	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public String toString(){
		return CourseCode+" - "+CourseName+" - "+Year+Semester+"\n" + "Capacity:"+Capacity+"\nLecturer: Not Assigned Yet. \nTeaching Asistant: None";

	}

}