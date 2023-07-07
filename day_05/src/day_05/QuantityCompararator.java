package day_05;

import java.util.Comparator;

public class QuantityCompararator implements Comparator<SaleDto>{

	@Override
	public int compare(SaleDto o1, SaleDto o2) {
		return o1.getQuantity() - o2.getQuantity();
	}
	
}
