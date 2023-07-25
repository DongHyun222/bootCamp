package day_17;

public class MyCircle extends MyShape implements MyDrawable{

	private int radius;
	
	public MyCircle() {
	}
	
	public MyCircle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", radius=" + radius;
	}

	@Override
	public void draw() {
		System.out.println("draw Circle");
	}
	
}
