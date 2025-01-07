package person;

public class Person {
	private static int generateId;
	private int id;
	private String name;
	private char gender;

	static {
		generateId = 1;
	}

	public Person() {
		super();
	}

	public Person(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
		id = generateId;
		generateId++;
	}

	public static int getGenerateId() {
		return generateId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}

}
