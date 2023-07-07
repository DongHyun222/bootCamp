package day_04;

public class MyMemberService {
	private MyMember[] mems = new MyMember[300];
	private int count = 0;	//객체 저장 위치이자 저장갯수
	
	public void add(MyMember mm) {
		mems[count] = mm;
		count++;
	}
	
	public int getCount() {
		return count;
	}

	public void printAll() {
		System.out.println("** 전체 출력 **");
		System.out.println("* 저장갯수 = "+count);
		for (int i = 0; i < count; i++) {
			System.out.println(mems[i]);
		} //end for
	} //end printAll()

	public MyMember searchByName(String findName) {
		for (int i = 0; i < count; i++) {
			if (findName == mems[i].getName()) {
				return mems[i];
			}
		}
		
		return null; //검색실패
	}

	public boolean update(String name, int i) {
		MyMember m = searchByName(name);
		if (m == null) 
			return false;
		int age = m.getAge();
		m.setAge(age + 1);
		return true;
	}
	

}
