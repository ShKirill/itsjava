package interfaces;

public class InterfacesPractice {

	public static void main(String[] args) {
		Creatable khotabich = new Gin();
		khotabich.createWish();

		Creatable badGin = new BadGin();
		badGin.createWish();
		System.out.println();
		
		System.out.println("Man");
		Man human = new Man();
		human.walk();
		human.run();
		human.swim();
		
		System.out.println("Dog");
		Dog  dog = new Dog();
		dog.run();
		dog.walk();
		dog.swim();
		System.out.println("Cat");
		Cat cat = new Cat();
		cat.run();
		cat.walk();
		cat.swim();
		System.out.println("Bird");
		Bird bird= new Bird();
		bird.fly();
		bird.walk();
		System.out.println("Fish");
		Fish fish= new Fish();
		fish.swim();
	}
}
