package interfaces;

public class Dog implements Runnable, Swimable, Walkable{

	@Override
	public void run() {
		
		System.out.println("Я умею бегать на дистанцию " + maxRunDistance());
	}

	@Override
	public int maxRunDistance() {
		return 500;
	}

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
		return 7.0;
	}

}
