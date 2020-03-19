import java.awt.Point;
import java.util.ArrayList;

public abstract class Shape implements Moveable {
	ArrayList<Point>points=new ArrayList<>();
	protected Point leftTop;
	protected boolean isCircular;
	protected double area;
	protected double perimeter;


	public abstract void calculatePoints();
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public abstract boolean isBounded(int x,int y); 
}
