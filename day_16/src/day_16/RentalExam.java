package day_16;

public class RentalExam {
	public static void main(String[] args) {
		//의자 : 대여종류, 고유번호, 대여일, 반납일
		//책상 : 대여종류, 고유번호, 대여일, 반납일
		//컴퓨터 : 대여종류, 고유번호, 대여일, 반납일
		//노트북 : 대여종류, 고유번호, 대여일, 반납일
		//프린터 : 대여종류, 고유번호, 대여일, 반납일
		//복사기 : 대여종류, 고유번호, 대여일, 반납일
		
	}
}

class chair extends rentalDate{
	private String type_chair, typeNum;
}

class desk extends rentalDate{
	private String type_chair, typeNum;
}

class rentalDate{
	private int sDate, eDate;
}
