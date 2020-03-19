import java.util.ArrayList;

public class AcademicStaff extends Member{
	private String OfficeNumber;
	protected String Title;
	ArrayList<Course>InstructorCourse=new ArrayList<Course>();

	public void assign(Instructor instructor , Course course) {
		if(InstructorCourse.size()>3) {
			System.out.println("CAnt be more than 3 ");
		}
		else {
			
			InstructorCourse.add(course); 
			course.setInstructor(instructor);
			System.out.println("success");
		}
		
		
	}}
