package WorkShop;

public class truck extends carType{
	private int ton;
	
	public truck() {
	}

	public truck(int carNum, int carPrice, String type, int carYear, int carBagi, int ton) {
		super(carNum, carPrice, type, carYear, carBagi);
		this.ton = ton;
	}

	public int getTon() {
		return ton;
	}
	public void setTon(int ton) {
		this.ton = ton;
	}

	@Override
	public String toString() {
		return "truck : "+super.toString()+"[ton=" + ton + "]";
	}
	
}
