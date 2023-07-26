package WorkShop_0726;

public class video extends LibType{
	private String videoStore;
	
	public video() {
	}

	public video(int libNumber, String libName, int price, String videoStore, int libCount) {
		super(libNumber, libName, price, libCount);
		this.videoStore = videoStore;
	}

	public String getVideoStore() {
		return videoStore;
	}
	public void setVideoStore(String videoStore) {
		this.videoStore = videoStore;
	}

	@Override
	public String toString() {
		return super.toString() + "videoStore=" + videoStore;
	}
	
}
