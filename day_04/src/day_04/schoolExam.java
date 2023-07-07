package day_04;

public class schoolExam {
	public static void main(String[] args) {
		//학교내 인원관리
		//관리대상 - 학생, 교수, 직원
		//학생 - 학번, 이름, 학과
		//교수 - 교번, 이름, 연구실호수
		//직원 - 사번, 이름, 부서
		//class-Person{ id, name }
		//class-Student extends Person{ hakgwa }
		//class-teacher extends Person{ yeongusil }
		//class-emp extends Person{ buseo }
		
		Person p = new Person("100", "홍길동");
		System.out.println(p);
		
		Student st = new Student("200", "김길동", "컴공");
		System.out.println(st);
		
		Emp ep = new Emp("300", "박길동", "개발");
		System.out.println(ep);
		
//		p = st;
//		System.out.println(p);
		
		Person[] pa = new Person[100];
		pa[0] = st;
		pa[1] = ep;
		System.out.println(pa[1]);
		
//		얘네는 안됨 -> 무조건 부모[0] = 자식객체가 되어야됨
//		Student[] lst = new Student[50];
//		lst[0] = ep;
		
		//학교인원관리기능
		SchoolService ss = new SchoolService();
		ss.add(st);
		ss.add(ep);
		
		System.out.println(p instanceof Person);
		//다운캐스팅을 할땐 항상 instanceof를 거쳐서 해야됨
		if (p instanceof Student) {
			Student st2 = (Student)p;
			System.out.println("학생입니다.");
		} else {
			System.out.println("학생이 아닙니다.");
		}
		
	}
}
