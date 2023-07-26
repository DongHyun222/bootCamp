package WorkShop_0726;

public class rental {
	//(대여번호, 회원id, 대여할물건관리번호, 대여년월일, 대여시분, 반납년월일, 반납시분)
	private int rentalNum, rentalCareNum;
	private String userId, startDate, startHour, endDate, endHour;
	
	public rental() {
	}

	public rental(int rentalNum, int rentalCareNum, String userId, String startDate, String startHour, String endDate,
			String endHour) {
		super();
		this.rentalNum = rentalNum;
		this.rentalCareNum = rentalCareNum;
		this.userId = userId;
		this.startDate = startDate;
		this.startHour = startHour;
		this.endDate = endDate;
		this.endHour = endHour;
	}

	public int getRentalNum() {
		return rentalNum;
	}

	public void setRentalNum(int rentalNum) {
		this.rentalNum = rentalNum;
	}

	public int getRentalCareNum() {
		return rentalCareNum;
	}

	public void setRentalCareNum(int rentalCareNum) {
		this.rentalCareNum = rentalCareNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndHour() {
		return endHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	@Override
	public String toString() {
		return "rental [rentalNum=" + rentalNum + ", rentalCareNum=" + rentalCareNum + ", userId=" + userId
				+ ", startDate=" + startDate + ", startHour=" + startHour + ", endDate=" + endDate + ", endHour="
				+ endHour + "]";
	}
	
}
