import java.awt.Point;

public class Rectangle extends Shape {
	int height,width;

		
		public Rectangle(int x, int y, int height, int width ) {
			this.height=height;
			this.width=width;
			leftTop=new Point(x,y);
			calculatePoints();
			area = calculateArea();
			perimeter = calculatePerimeter();
			isCircular =false;
			System.out.println(toString());
		}
	
	public void calculatePoints() {
		int x2=(leftTop.x+width);
		int y2=leftTop.y;
		int x3=(leftTop.x+width);
		int y3=leftTop.y+height;
		int x4=(leftTop.x);
		int y4=(leftTop.y+height);
		points.add(leftTop);
		points.add(new Point(x2,y2));
		points.add(new Point(x3,y3));
		points.add(new Point(x4,y4));

	}

	@Override
	public double calculateArea() {
		return Math.round((width*height*10.0))/10.0;

	}

	@Override
	public double calculatePerimeter() {
		return 2*(width+height);
	}
	public String toString() {
		return "Rectangle[h="+height+",w="+width+"] \nPoints[("+leftTop.x+","+leftTop.y+")("+points.get(1).getX()+","+points.get(1).y+")("+points.get(2).getX()+","+points.get(2).getY()+")("
				+ points.get(3).getX()+","+points.get(3).getY()+")]\nArea="+area+"\nPerimeter="+perimeter;
	}

	@Override
	public void move(int newx, int newy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isBounded(int x, int y) {
	
		if(points.get(0).getX()<=x && points.get(0).getY()<=y && points.get(2).getX()>=x && points.get(2).getY()>=y){
			return true;
		}
		else return false;
	}

}
