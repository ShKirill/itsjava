package interfaces;

public class Bird implements Flyable, Walkable {

	@Override
	public void fly() {
		System.out.println("I can fly!!! Distance :" + flyMaxDistance());
		
	}

	@Override
	public String flyMaxDistance() {
		return "500 km";
	}

	@Override
	public void walk() {
		System.out.println("Я умею ходить!!");
		
	}

}
