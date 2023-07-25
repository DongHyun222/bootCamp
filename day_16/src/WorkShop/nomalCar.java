package WorkShop;

public class nomalCar extends carType{
	private int people;
	
	public nomalCar() {
	}

	public nomalCar(int carNum, int carPrice, String type, int carYear, int carBagi,int people) {
		super(carNum, carPrice, type, carYear, carBagi);
		this.people = people;
	}

	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "nomalCar : "+super.toString()+"[people=" + people + "]";
	}
	
}
