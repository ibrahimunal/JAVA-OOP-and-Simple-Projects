import java.awt.Point;

public class Square extends Shape{

	
	
	int edge;
	public Square(int x, int y , int edge) {
		isCircular=false;
		leftTop=new Point(x,y);
		this.edge=edge;
		area=calculateArea();
		perimeter=calculatePerimeter();
		calculatePoints();
		System.out.println(toString());
	}
	
	public void calculatePoints() {
	int x2=(leftTop.x+edge);
	int y2=leftTop.y;
	int x3=leftTop.x+edge;
	int y3=leftTop.y+edge;
	int x4=leftTop.x;
	int y4=leftTop.y+edge;
	points.add(leftTop);
	points.add(new Point(x2,y2));
	points.add(new Point(x3,y3));
	points.add(new Point(x4,y4));

	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.pow((double)edge, 2);
	}

	@Override
	public double calculatePerimeter() {
	
		return 4*edge;// TODO Auto-generated method stub
	}
	public String toString(){
		return "Square[e=" + edge + "]\n" +
				"Points[(" + points.get(0).x + "," + points.get(0).y + ")(" + points.get(1).x + "," + points.get(1).y + ")("  + points.get(2).x + "," + points.get(2).y + ")("  + points.get(3).x + "," + points.get(3).y + ")]\n" +
				"Area=" + area + "\n" +
						"Perimeter=" + perimeter; 
	}
	public void move(int x, int y){
		
		Point npoint=new Point(x,y);
		Point npoint2=new Point(x+edge,y);
		Point npoint3=new Point(x+edge,y+edge);
		Point npoint4=new Point(x,y+edge);
	points.set(0, npoint);
	points.set(1, npoint2);
	points.set(2, npoint3);
	points.set(3, npoint4);
	System.out.println(toString());
		
	}

	@Override
	public boolean isBounded(int x, int y) {
		if(points.get(0).getX()<=x && points.get(0).getY()<=y && points.get(2).getX()>=x && points.get(2).getY()>=y){
			return true;
		}
		return false;
	}
	
	}
