package WorkShop;

public class van extends carType{
	private int people, ton;
	
	public van() {
	}

	public van(int carNum, int carPrice, String type, int carYear, int carBagi, int people, int ton) {
		super(carNum, carPrice, type, carYear, carBagi);
		this.people = people;
		this.ton = ton;
	}

	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}

	public int getTon() {
		return ton;
	}
	public void setTon(int ton) {
		this.ton = ton;
	}

	@Override
	public String toString() {
		return "van : "+super.toString()+"[people=" + people + ", ton=" + ton + "]";
	}

	
}
