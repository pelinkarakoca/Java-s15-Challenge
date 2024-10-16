package library.collection;

abstract public class Periodicals extends LibraryCollection {
	private Period period;

	public Periodicals(String title, String language, int numOfPages, Period period) {
		super(title, language, numOfPages);
		this.period = period;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}
}
