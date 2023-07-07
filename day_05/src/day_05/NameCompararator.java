package day_05;

import java.util.Comparator;

public class NameCompararator implements Comparator<MyMember>{

	@Override
	public int compare(MyMember o1, MyMember o2) {
//		return o1.getAge() - o2.getAge();	//음수면 o1,o2순서대로
		return o1.getName().compareTo(o2.getName());	//오름차순
//		return o2.getName().compareTo(o1.getName());	내림차순
	}
	
}
