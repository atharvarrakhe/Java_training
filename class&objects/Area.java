
public class Area {
	private double radius;
	private int length, breadth;
	private int height;
	private int base;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	private double calculateAreaofCircle(){
		double area=22*radius*radius/7;
		return area;
		}
	private int calculateAreaofRectangle(){
		int area=length*breadth;
		return area;
		}
	public double calculateAreaoftringle(){
		double area=(double)base*height*1/2;
		return area;
		}
	private double calculateAreaofCylinder(){
		double area=22*radius*radius*height/7;
		return area;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
