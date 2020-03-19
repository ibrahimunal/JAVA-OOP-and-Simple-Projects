import java.util.*;
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Course>Courses=new ArrayList<Course>();
		ArrayList<Instructor>Ins=new ArrayList<Instructor>();
		ArrayList<String>Id=new ArrayList<>();
		ArrayList<Student>Students=new ArrayList<>();


		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	

		do{

			String str1=sc.nextLine();
			String arr[]=str1.split(";");
			switch(arr[0]){

			case "createcourse":
				boolean dogruMu=true;

				for(int i=0; i<Courses.size();i++){
					if(arr[2].equalsIgnoreCase(Courses.get(i).getCourseCode())){
						dogruMu=false;
					}
				}
				if(dogruMu){
					System.out.println("success");
					Course crs=new Course(arr[2],arr[3],arr[4],arr[5],Integer.parseInt(arr[6]));
					Courses.add(crs);
				}
				else{
					System.out.println("A course with code "+arr[2]+" already exist");
				}
				break;

			case "createstudent":
				boolean DogruMu3 = true;
				for(int i=0 ; i < Id.size() ; i++){
					if(Id.get(i).equalsIgnoreCase(arr[3])){
						System.out.println("A person with ID "+ arr[3] +" already exist.");
						DogruMu3 = false;
					}
				}
				if(DogruMu3){
					Student std=new Student(arr[2],arr[3],arr[4]);
					System.out.println("success");
					Id.add(arr[3]);
					Students.add(std);
				}
				break;

			default : System.out.println("Unknown comment");

			case "reportcourse":

				for(int i=0; i<Courses.size(); i++){
					if(arr[2].equalsIgnoreCase(Courses.get(i).getCourseCode())){
						System.out.println(Courses.get(i));
					}
				}

				break;
			case "createinstructor":
				boolean dogruMu2=true;

				for(int i=0; i<Id.size(); i++){
					if(arr[3].equalsIgnoreCase(Id.get(i))){
						System.out.println("A person with ID "+ arr[3] +" already exist.");
						dogruMu2=false;
					}

				}
				if(dogruMu2){
					Instructor ins=new Instructor(arr[2],arr[3],arr[4],arr[5]);
					Ins.add(ins);
					Id.add(arr[3]);
					System.out.println("success");
				}
				break;
			case "assignstudent" :
			
				for(int i=0; i<Students.size(); i++) {
					if(arr[2].equals(Students.get(i).getID())){
					
					for(int k=0; k<Courses.size(); k++) {
						if(arr[3].equals(Courses.get(k).getCourseCode())) {
							
							Students.get(i).assignToCourse(Courses.get(k));
							Courses.get(k).AddStudent(Students.get(i));
							System.out.println("success");
						}
					}
					
					}
				
				}
			case "reportstudent":
				for(int i=0; i<Students.size(); i++) {
					if(arr[2].equals(Students.get(i).getID())) {
					System.out.println(Students.get(i).toString());
					}
				}
			}	

		}




		while(true);

}}