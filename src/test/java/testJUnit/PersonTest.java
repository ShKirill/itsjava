package testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Person должен: ")
public class PersonTest {
	public static final String DEFAULT_NAME = "Петя";
	public static final int DEFAULT_AGE = 16;
	public static final String NEW_NAME = "Вася";
	public static final int NEW_AGE = 4;

	@DisplayName(" корректно создаваться конструктором.")
	@Test
	public void shouldHaveCorrectConstructor() {
		Person testPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

		assertEquals(DEFAULT_NAME, testPerson.getName());
		assertEquals(DEFAULT_AGE, testPerson.getAge());

	}

	@DisplayName(" корректно изменять Name&Age")
	@Test
	public void shouldHaveCorrectUpdatePerson() {
		Person testPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

		testPerson.setName(NEW_NAME);
		testPerson.setAge(NEW_AGE);

		assertEquals(NEW_NAME, testPerson.getName());
		assertEquals(NEW_AGE, testPerson.getAge());
	}

}
