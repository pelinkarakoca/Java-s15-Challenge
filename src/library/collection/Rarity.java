package library.collection;

public enum Rarity {
	COMMON(1), RARE(3), UNIQUE(5);
	private final int coefficient;

	private Rarity(int coefficient){
		this.coefficient = coefficient;
	}
	public int getCoefficient() {
		return coefficient;
	}
}
