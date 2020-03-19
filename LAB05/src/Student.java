
public class Student extends Member {


	public Student(String name,String ID,String Title) {
		this.name=name;
		this.ID=ID;
		this.Title=Title;
		eat();

	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void eat(){
		System.out.println("eating from student");
	}
	/*
	public String getID(){
		return ID;	
	}

	public void setID(String ID){
		this.ID=ID;
	}
	public String getTitle(){
		return Title;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}*/

	public void assignToCourse(Course course) {
		coursesTaken.add(course);
	}
	public String toString() {
		String str;
		str=this.Title+" "+this.name+" - "+this.ID+"\n"+"Courses: ";
		for(int i=0; i<coursesTaken.size(); i++) {
			if(i==(coursesTaken.size()-1)) {
				str=str.concat(coursesTaken.get(i).getCourseCode());
			}
			else {
				str=str.concat(coursesTaken.get(i).getCourseCode()+", ");
			}
		}
		return str;
	}
}


