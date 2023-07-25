package WorkShop;

import java.util.ArrayList;

public class RentService {
	
	private ArrayList<carType> cars = new ArrayList<carType>();
	private ArrayList<memberType> mems = new ArrayList<memberType>();
	private ArrayList<rent> rents = new ArrayList<rent>();
	
	public void add(nomalCar nc) {
		cars.add(nc);
	}
	
	public void add(van vn) {
		cars.add(vn);
	}
	
	public void add(truck tc) {
		cars.add(tc);
	}
	
	public void add(bus bs) {
		cars.add(bs);
	}
	
	public void add(individualMember im) {
		mems.add(im);
	}
	
	public void add(corporateMember cm) {
		mems.add(cm);
	}

	public void rent(int memberNum, int carNum, int carPrice, String startDate, int startTime, String endDate, int endTime) {
		rent r = new rent(memberNum, carNum, carPrice, startDate, startTime, endDate, endTime);
		rents.add(r);
	}

	public int getCount() {
		return rents.size();
//		return rent.getRentCount();
	}

	public void rentprint() {
		for (rent rent : rents) {
			System.out.println(rent.toString());
		}
	}
	
}
