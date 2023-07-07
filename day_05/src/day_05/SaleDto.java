package day_05;

public class SaleDto {
	private int mno;
	private String isbn;
	private int quantity;
	
	//생성자
	public SaleDto() {
	}

	public SaleDto(int mno, String isbn, int quantity) {
		super();
		this.mno = mno;
		this.isbn = isbn;
		this.quantity = quantity;
	}

	//GetterSetter
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//toString
	@Override
	public String toString() {
		return "SaleDto [mno=" + mno + ", isbn=" + isbn + ", quantity=" + quantity + "]";
	}
		
}
