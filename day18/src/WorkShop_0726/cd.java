package WorkShop_0726;

public class cd extends LibType{
	private String singer;
	
	public cd() {
	}

	public cd(int libNumber, String libName, int price,  String singer, int libCount) {
		super(libNumber, libName, price, libCount);
		this.singer = singer;
	}

	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "singer=" + singer;
	}
}
