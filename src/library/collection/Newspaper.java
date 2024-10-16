package library.collection;

public class Newspaper extends Periodicals {
private boolean hasSupplement;
	public Newspaper(String title, String language, int numOfPages, Period period, boolean hasSupplement) {
		super(title, language, numOfPages, period);
		this.hasSupplement = hasSupplement;
	}

	public boolean isHasSupplement() {
		return hasSupplement;
	}

	public void setHasSupplement(boolean hasSupplement) {
		this.hasSupplement = hasSupplement;
	}

	@Override
	public String toString() {
		return "Newspaper{" +
				"hasSupplement=" + hasSupplement +
				'}';
	}
}
