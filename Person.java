package person;

import java.util.Objects;

public class Person {
	private static int id;
	private String name;
	private char gender;

	public Person() {
		super();
	}

	public Person(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Person.id = id;
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
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return gender == other.gender && Objects.equals(name, other.name);
	}
}
