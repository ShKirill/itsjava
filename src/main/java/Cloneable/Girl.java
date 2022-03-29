package Cloneable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Girl implements Cloneable {
	private final String name;
	private int age;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Girl [name= " + name + ", age= " + age + "]";
	}
	
	
}
