package day_17;

public class ShapeExam {
	public static void main(String[] args) {
//		MyLine ml = new MyLine(0,0,5,5);
//		MyShape ms = ml;
//		ml.draw();
////		ms.draw();안됨, MyShape에서 선언이 안되있음
//		MyDrawable md = ml;
//		md.draw();
//		
//		MyCircle mc = new MyCircle(3,3,9);
//		MyDrawable md2 = mc;
//		md2.draw();
		
		MyDrawable[] mdarr = new MyDrawable[3];
		mdarr[0] = new MyLine(0, 0, 3, 3);
		mdarr[1] = new MyCircle(5,5,9);
		mdarr[0].draw();
		System.out.println(mdarr[0].toString());
		mdarr[1].draw();
		mdarr[2] = new Student("홍", "컴공");
		mdarr[2].draw();
		
	}
}
