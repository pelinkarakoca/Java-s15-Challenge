public enum MembershipType {
	STUDENT(2), INSTRUCTOR(5), OTHER(1);
	private final int maxLimit;

	private MembershipType(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	public int getMaxLimit() {
		return maxLimit;
	}
}
