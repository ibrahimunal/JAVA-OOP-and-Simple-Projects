import java.util.ArrayList;

public class Member {
ArrayList<Course>coursesTaken=new ArrayList<Course>();
protected String name;
protected String ID;
protected String Title;
int kilo=50;
public String getID() {
	return ID;
}
public void eat(int ekle){
	System.out.println("eating from superclass");
	kilo+=ekle;
	System.out.println(kilo);
}

public int getKilo() {
	return kilo;
}
public void setKilo(int kilo) {
	this.kilo = kilo;
}
public String getTitle() {
	return Title;
}


public void setTitle(String title) {
	Title = title;
}


public void setID(String iD) {
	ID = iD;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}