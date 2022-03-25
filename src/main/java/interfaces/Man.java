package interfaces;

public class Man implements Walkable, Runnable, Swimable {

	@Override
	public void walk() {
		System.out.println("Я умею ходить!!");
		
	}

	@Override
	public void swim() {
		System.out.println("Я умею плавать со скоростью " + maxSwimSpeed());
		
	}

	@Override
	public double maxSwimSpeed() {
		return 5.0;
	}

	@Override
	public void run() {
		System.out.println("Я умею бегать на дистанцию " + maxRunDistance());
		
	}

	@Override
	public int maxRunDistance() {
		return 15;
	}

}
