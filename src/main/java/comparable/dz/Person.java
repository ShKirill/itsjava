package comparable.dz;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Cloneable, Comparable<Person> {
	private final String name;
	private final String surname;
	private final int age;

	@Override
	public int compareTo(Person person) {
		int result = 0;
		if ((surname.equals(person.surname)) == true) {
			result = 1;
		} else if ((name.equals(person.name)) == true) {
			result = 1;
		} else if (age == person.age) {
			result = 1;
		}
		return result;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Person [name = " + name + ", surname = " + surname + ", age = " + age + "]";
	}

}
