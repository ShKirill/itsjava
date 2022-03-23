package testJUnit;

public class Main {

	public static void main(String[] args) {

		Person kirill = new Person("Петя", 16);

		kirill.setAge(17);
		System.out.println("Age: " + kirill.getAge());
		System.out.println("Можно бухать? " + kirill.takeBeer());
		System.out.println("Age after birthday: " + kirill.birthday());
		System.out.println("Можно бухать? " + kirill.takeBeer());

	}

}
