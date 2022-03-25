package interfaces;

public class Fish implements Swimable {

	@Override
	public void swim() {
		System.out.println("Буль-буль-буль!!! Max Speed: " + maxSwimSpeed());
		
	}

	@Override
	public double maxSwimSpeed() {
		return 50.0;
	}

}
