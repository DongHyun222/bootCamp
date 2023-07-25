package day_17;
/** 도형들의 공통속성정의 */
public abstract class MyShape {
	private int x,y;	//도형기준좌표
	
	public MyShape() {
		
	}
	
	public MyShape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyShape [x=" + x + ", y=" + y + "]";
	}
	
	public abstract String draw();	//도형 그리기 기능 제공
	
}
