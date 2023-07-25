package WorkShop;

public class rent {
	private int RentCount;
	private String startDate, endDate;
	private int startTime,endTime;
	private int memberNum, carNum, carPrice;
	
	public rent() {
	}

	public rent(int rentCount, String startDate, String endDate, int startTime, int endTime, int memberNum, int carNum,
			int carPrice) {
		super();
		RentCount = rentCount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.memberNum = memberNum;
		this.carNum = carNum;
		this.carPrice = carPrice;
		this.RentCount++;
	}

	public rent(int memberNum2, int carNum2, int carPrice2, String startDate2, int startTime2, String endDate2,
			int endTime2) {
		this.startDate = startDate2;
		this.endDate = endDate2;
		this.startTime = startTime2;
		this.endTime = endTime2;
		this.memberNum = memberNum2;
		this.carNum = carNum2;
		this.carPrice = carPrice2;
		this.RentCount++;
	}

	public int getRentCount() {
		return RentCount;
	}
	public void setRentCount(int rentCount) {
		RentCount = rentCount;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "rent [" + "startDate=" + startDate + ", endDate=" + endDate + ", startTime="
				+ startTime + ", endTime=" + endTime + ", memberNum=" + memberNum + ", carNum=" + carNum + ", carPrice="
				+ carPrice + "]";
	}
	
	
	
}
