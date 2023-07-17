package 비교리뷰;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableExam {
	static class Person implements Comparable<Person>{
		String name;
		int age;
		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		@Override
		public int compareTo(Person o) {
			return this.age - o.age;	//음수이면 this가 선순위
		}
		
		@Override
		public String toString() {
			return name;
		}
		
	}
	static class NameComparator implements Comparator<Person>{
		@Override
		public int compare(Person o1, Person o2) {
			//o1 - o2가 기본, 음수가 나오면 o1이 선순위
			return o1.name.compareTo(o2.name);
		}
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("김길동", 35);
		System.out.println(p1.compareTo(p2));
		ArrayList<Person> arr = new ArrayList<ComparableExam.Person>();
		arr.add(p2);
		arr.add(p1);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		
		//이름기준 정렬 -> Person자체적으로 나이기준 정렬법이 정해져있음. Comparator
		NameComparator nc = new NameComparator();
		Collections.sort(arr, nc);
		System.out.println(arr);
	}
}
