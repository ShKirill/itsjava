package object;

public class Dog {
	private final String nickname;
	private int age;
 
	public Dog(String nickname, int age) {
		this.nickname = nickname;
		this.age = age;
	}
 
	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}
 
	@Override
	public int hashCode() {
		final int prime = 31; // константа prime
		int result = 1;
		result = prime * result + age; // получение значения result для age
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode()); // получение значения result для
																					// никнейма
		return result; // возврат result
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // проверка совпадения текущего экземпляра с переданным объектом obj
			return true; // возврат значение true
		}
		if (!(obj instanceof Dog)) {// проверка что obj не являеться собакой
			return false; // возврат значение false
		}
		Dog other = (Dog) obj; // явное приведение класса
		if (age != other.age) { // проверка не равенства возраста
			return false; // возврат значение false
		}
		if (nickname == null) { // проверка что никнейм равен нулю
			if (other.nickname != null) { // проверка что другой никнейм не равен null
				return false; // возврат значение false
			}
		} else if (!nickname.equals(other.nickname)) { // сравнивание никнеймов через equals
			return false; // возврат значение false
		}
		return true; // возврат значение true
	}
 
	@Override
	public String toString() {
		return "Dog { Nickname: " + nickname + " Age: " + age + "}";
	}
}