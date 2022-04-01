package comparable.dz;

import java.util.Arrays;

public class ComparableDz {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person test1 = new Person("test1", "testi", 18);
		Person test2 = new Person("test2", "testis", 17);
		Person test3 = new Person("test2", "testis", 57);
		Person test4 = new Person("test4", "testis", 18);
		Person test5 = new Person("test2", "testis", 17);

		Person testClone = (Person) test3.clone();

		System.out.println("CompareTo test1 - test2: " + test1.compareTo(test2));
		System.out.println("CompareTo test1 - test3: " + test1.compareTo(test3));
		System.out.println("CompareTo test1 - test4: " + test1.compareTo(test4));
		System.out.println("CompareTo test1 - test5: " + test1.compareTo(test5));
		System.out.println("CompareTo test1 - test2: " + test1.compareTo(test2));
		System.out.println("CompareTo test2 - test3: " + test2.compareTo(test3));
		System.out.println("CompareTo test2 - test5: " + test2.compareTo(test5));

		System.out.println("CompareTo test3 - testClone: " + test3.compareTo(testClone));

		Person[] personArray = { test1, test2, test3, test4, test5, testClone };

		System.out.println(Arrays.toString(personArray));
		Arrays.sort(personArray);
		System.out.println(Arrays.toString(personArray));
	}

}
