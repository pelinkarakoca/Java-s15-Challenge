package library.collection;

public class Magazine extends Periodicals {
	private int numOfIllustrations;
	private int numOfInterviews;

	public Magazine(String title, String language, int numOfPages, Period period, int numOfIllustrations, int numOfInterviews) {
		super(title, language, numOfPages, period);
		this.numOfIllustrations = numOfIllustrations;
		this.numOfInterviews = numOfInterviews;
	}

	public int getNumOfIllustrations() {
		return numOfIllustrations;
	}

	public void setNumOfIllustrations(int numOfIllustrations) {
		this.numOfIllustrations = numOfIllustrations;
	}

	public int getNumOfInterviews() {
		return numOfInterviews;
	}

	public void setNumOfInterviews(int numOfInterviews) {
		this.numOfInterviews = numOfInterviews;
	}

	@Override
	public String toString() {
		return "Magazine{" +
				"numOfIllustrations=" + numOfIllustrations +
				", numOfInterviews=" + numOfInterviews +
				'}';
	}
}
