package WorkShop_0726;

public class LibType {
	private int LibNumber;
	private String LibName;
	private int price, LibCount;
	
	public LibType() {
	}

	public LibType(int libNumber, String libName, int price, int libCount) {
		super();
		LibNumber = libNumber;
		LibName = libName;
		this.price = price;
		LibCount = libCount;
	}

	public int getLibNumber() {
		return LibNumber;
	}
	public void setLibNumber(int libNumber) {
		LibNumber = libNumber;
	}
	public String getLibName() {
		return LibName;
	}
	public void setLibName(String libName) {
		LibName = libName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getLibCount() {
		return LibCount;
	}
	public void setLibCount(int libCount) {
		LibCount = libCount;
	}

	@Override
	public String toString() {
		return "LibNumber=" + LibNumber + ", LibName=" + LibName + ", price=" + price + ", LibCount="
				+ LibCount;
	}
}
