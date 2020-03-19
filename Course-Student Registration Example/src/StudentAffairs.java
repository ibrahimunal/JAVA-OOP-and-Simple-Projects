import java.util.ArrayList;
import java.util.Scanner;

public class StudentAffairs {
	static ArrayList <Course> Courses;
	static ArrayList<Student> Students;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input="";
		do {
			input=sc.next();
			switch(input) {
			case "createStudent":
				String sname =sc.nextLine();
				String snumber =sc.nextLine();
				Student student=new Student(sname,snumber);
				Students.add(student);
				break;
			case "createCourse" :

				String courseCode=sc.next();
				int Capacity=sc.nextInt();
				Course course=new Course(courseCode,Capacity);
				Courses.add(course);
				break;
			case "enrollStudent ":
				Student std = new Student();
				Course crs=new Course();
				String studentID=sc.next();
				String CourseCode=sc.next();
				for(int i =0; i<Students.size(); i++) {
					if(Students.get(i).getStudentID().equals(studentID))
					std=Students.get(i);	
				}
				for(int i=0; i<Courses.size(); i++) {
					if(Courses.get(i).getCourseCode().equals(CourseCode))
						crs=Courses.get(i);
				}
				crs.AddStudent(std);
				std.EnrollToCourse(crs);
				break;
			
			case "enterGrade" :
				Student newStudent =new Student();
				studentID=sc.next();
				courseCode=sc.next();
				String letterGrade=sc.next();
				for(int i=0; i<Students.size(); i++) {
					if(Students.get(i).getStudentID().equals(studentID))
						newStudent=Students.get(i);
				}
				newStudent.AddGradeToCourse(courseCode, letterGrade);
				break;
			case "calculateCourseAvg" :
				Course Crs=new Course();
				courseCode=sc.next();
				for(int i=0; i<Courses.size(); i++) {
					if(Courses.get(i).CourseCode.equals(courseCode))
						Crs=Courses.get(i);
				}
				Crs.CalculateCourseAvg();
				break;


					


			}


		}

		while(!input.equals("quit"));

	}

}
