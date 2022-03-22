package testJUnit;

public class Main {

	public static void main(String[] args) {

		Person kirill = new Person("Петя", 16);

		kirill.setAge(17);
		System.out.println("Age: " + kirill.getAge());
		System.out.println(kirill.takeBeer());

		kirill.birthday();
		System.out.println("Age: " + kirill.getAge());

		System.out.println(kirill.takeBeer());

	}

}
