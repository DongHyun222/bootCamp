package day_05;

public class BookDto {
	private String isbn, title;
	private int price;
	
	//생성자
	public BookDto() {
	}

	public BookDto(String isbn, String title, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDto [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
	
	
}
