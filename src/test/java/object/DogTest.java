package object;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Класс Dog должен: ")
public class DogTest {

	public static final String DEFAULT_NAME = "TestGurka";
	public static final int DEFAULT_AGE = 7;
	public static final String NEW_NAME = "TestGurka2";
	public static final int NEW_AGE = 4;

	@DisplayName(" корректно создаваться конструктором.")
	@Test
	public void shouldHaveCorrectConstructor() {
		Dog dog = new Dog(DEFAULT_NAME, DEFAULT_AGE);

		assertEquals(DEFAULT_NAME, dog.getNickname());
		assertEquals(DEFAULT_AGE, dog.getAge());

	}
//	тест коммита
	@DisplayName(" корректно изменять Dog")
	@Test
	public void shouldHaveCorrectUpdateDog() {
		Dog dog = new Dog(DEFAULT_NAME, DEFAULT_AGE);

		dog.setNickname(NEW_NAME);
		dog.setAge(NEW_AGE);

		assertEquals(NEW_NAME, dog.getNickname());
		assertEquals(NEW_AGE, dog.getAge());
	}

}
