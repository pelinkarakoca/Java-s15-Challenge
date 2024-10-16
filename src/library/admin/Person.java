package library.admin;

abstract public class Person {
	private String name;
	private Long id;

	public Person(String name, Long id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void whoYouAre() {
		System.out.println("I am " + getClass().getName() + " " + name);
	}
}
