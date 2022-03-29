package Cloneable;

public class CloneablePractice {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Girl testG1 = new Girl("testG1", 18);
		Girl testG2 = (Girl) testG1.clone();
		
		
		System.out.println("testG1 = " + testG1);
		System.out.println("testG2 = " + testG2);
	}

}
