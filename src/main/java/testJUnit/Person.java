package testJUnit;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int birthday() {
//    	который увеличивает возраст на 1
		return age = age + 1;

	}

	public boolean takeBeer() {
		boolean y = false;
//		который проверяет возраст и выдает true если возраст больше 18 и false в ином случае
		if (age >= 18) {
			y = true;
		}
		return y;
	}
}
