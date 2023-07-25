package day_16;

public class Mycircle extends MyShape{
	private int radius;
	
	public Mycircle() {
	}

	public Mycircle(int x1, int y1, int radius) {
		super(x1,y1);
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
		return super.toString() + ", " +"[radius=" + radius + "]";
	}
	
	@Override
	public String draw() {
		return "Circle";
	}
}
