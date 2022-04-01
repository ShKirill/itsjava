package comparable.dz;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Cloneable, Comparable<Person> {
	private final String name;
	private final String surname;
	private final int age;

//	2. Реализовать интерфейс Comparable. Реализовать метод compareTo(), 
//	который будет сравнивать человека по фамилии, 
//	если фамилии одинаковые, 
//	то по имени, 
//	в ином случае по возрасту.

	@Override
	public int compareTo(Person person) {

		int result = this.surname.compareTo(person.surname); //	если фамилии одинаковые, 
		if (result == 0) {
			result = this.name.compareTo(person.name);
			if (result == 0) {
				result = this.age - person.age;
			}
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
