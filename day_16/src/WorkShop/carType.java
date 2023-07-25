package WorkShop;

public class carType {
	//차번호, 대여비, 차종, 연식, 배기량까지만 (탑승인원수, 적재량은 따로)
	private int carNum;
	private int carPrice;
	private String type;
	private int carYear;
	private int carBagi;

	public carType() {
	}

	public carType(int carNum, int carPrice, String type, int carYear, int carBagi) {
		super();
		this.carNum = carNum;
		this.carPrice = carPrice;
		this.type = type;
		this.carYear = carYear;
		this.carBagi = carBagi;
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

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public int getCarBagi() {
		return carBagi;
	}
	public void setCarBagi(int carBagi) {
		this.carBagi = carBagi;
	}

	@Override
	public String toString() {
		return "[carNum=" + carNum + ", carPrice=" + carPrice + ", type=" + type + ", carYear=" + carYear
				+ ", carBagi=" + carBagi + "]";
	}
	
}
