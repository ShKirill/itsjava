package comparable.dz;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
	private final String name;
	private final String surname;
	private final int age;
}
