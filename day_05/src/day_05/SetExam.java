package day_05;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		
		박태환선수 bt = new 박태환선수();
		수영선수 s1;
		s1 = bt;
		s1.swimming();	//공던지기 불가능
		
		야구선수 b1;
		b1 = bt;
		b1.공던지기();		//swimming 불가능 
//		둘다 bt를 가르키나 변수의 객체가 달라서 저렇게됨
	}
}

interface 야구선수{
	public void 공던지기();
}
interface 수영선수 {
	public void swimming();
}
class 박태환선수 implements 수영선수,야구선수 {
	public void swimming() {
		System.out.println("수영하기");
	}
	public void 공던지기() {
		System.out.println("공던지기");
	}
}
