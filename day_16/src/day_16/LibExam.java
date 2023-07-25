package day_16;

public class LibExam {
	public static void main(String[] args) {
		//도서대여 : 도서번호, 대여일, 반납일, 빌린사람, 빌린개수
		//테이프대여 : 테이프번호, 대여일, 반납일, 빌린사람, 빌린개수
		//CD대여 : CD번호, 대여일, 반납일, 빌린사람, 빌린개수
		
		MyLibrary lib = new MyLibrary();
	}
}

class MyLibrary extends MyType{
	private int typeNum;
	
	public MyLibrary() {
	}

	public MyLibrary(int typeNum, String startDate, String endDate, String person, int count,int typeNum1) {
		super(startDate,endDate,person,count);
		this.typeNum = typeNum1;
	}
	
}

class MyType {
	private String startDate, endDate, person;
	private int count;
	
	public MyType() {
	}

	public MyType(String startDate, String endDate, String person, int count) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.person = person;
		this.count = count;
	}
	
}
