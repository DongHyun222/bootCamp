package WorkShop_0726;

public class book extends LibType{
	private String bookStore;
	
	public book() {
	}

	public book(int libNumber, String libName, int price, String bookStore, int libCount) {
		super(libNumber, libName, price, libCount);
		this.bookStore = bookStore;
	}

	public String getBookStore() {
		return bookStore;
	}
	public void setBookStore(String bookStore) {
		this.bookStore = bookStore;
	}

	@Override
	public String toString() {
		return super.toString() + " bookStore=" + bookStore;
	}
}
