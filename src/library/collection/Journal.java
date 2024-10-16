package library.collection;

public class Journal extends Periodicals{
	private String field;

	public Journal(String title, String language, int numOfPages, Period period, String field) {
		super(title, language, numOfPages, period);
		this.field = field;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "Journal{" +
				"field='" + field + '\'' +
				'}';
	}
}
