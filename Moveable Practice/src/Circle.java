import java.awt.Point;

public class Circle extends Shape{
int radius;
double perimeter;

 public Circle(int x, int y, int radius){
	isCircular=true;
	leftTop = new Point(x,y);
	this.radius = radius;
	calculatePoints();
	area = calculateArea();
	perimeter = calculatePerimeter();
	System.out.println(toString());
 }

@Override
public void calculatePoints() {
	// TODO Auto-generated method stub
	int x2=(leftTop.x+2*radius);
	int y2=(leftTop.y+2*radius);
	points.add(leftTop);
	points.add(new Point(x2,y2));
}

@Override
public double calculateArea() {
	// TODO Auto-generated method stub
	return Math.round(Math.PI*Math.pow(radius, 2)*10.0)/10.0;
}

@Override
public double calculatePerimeter() {
	// TODO Auto-generated method stub
	return Math.round((radius*Math.PI*2)*10.0)/10.0;
}
public void move(int x, int y){
	
	
	Point npoint=new Point(x,y);
	Point npoint2=new Point(x+2*radius,y+2*radius);
	
points.set(0, npoint);
points.set(1, npoint2);

System.out.println(toString());
	

}
public String toString() {
	return "Circle[r=" + radius + "]\n" +
			"Points[(" + points.get(0).x + "," + points.get(0).y + ")(" + points.get(1).x + "," + points.get(1).y + ")]\n" +
			"Area=" + area +"\n" +
					"Perimeter=" + perimeter;
}

@Override
public boolean isBounded(int x, int y) {
	if(Math.sqrt(Math.pow(points.get(0).getX()+radius-x, 2)+Math.pow(points.get(0).getY()+radius -y , 2))>=radius)
	return false;
	else {
		return true;
	}
}

}
