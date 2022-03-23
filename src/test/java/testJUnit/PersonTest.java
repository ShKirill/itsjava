package testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Person должен: ")
public class PersonTest {
	public static final String DEFAULT_NAME = "Петя";
	public static final int DEFAULT_AGE = 17;
	public static final String NEW_NAME = "Вася";
	public static final int NEW_AGE = 4;
	public static final int DEFAULT_birthdayAGE = 18;
	public static final boolean DEFAULT_AGEFORBEER = false;
	public static final boolean DEFAULT_AGEFORBEER_afterBirthday = true;

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

	@DisplayName(" корректно изменять Age после ДР")
	@Test
	public void shouldHaveCorrectUpdateBirthday() {
		Person testPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

		assertEquals(DEFAULT_birthdayAGE, testPerson.birthday());

	}

	@DisplayName(" корректно проверка разрешения на пиво")
	@Test
	public void shouldHaveCorrectAgeVerification() {
		Person testPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

		assertEquals(DEFAULT_AGEFORBEER, testPerson.takeBeer());
		testPerson.birthday();
		assertEquals(DEFAULT_AGEFORBEER_afterBirthday, testPerson.takeBeer());
	}

}
