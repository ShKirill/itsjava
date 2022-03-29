package comparable;

import java.util.Arrays;

public class ComparablePractice {

	public static void main(String[] args) {
		Boy test1 = new Boy ("Test1", 15.2, 189.2);
		Boy test2 = new Boy ("Test2", 16.2, 183.9);
		Boy test3 = new Boy ("Test3", 16.2, 190.9);
		
		System.out.println("CompareTo: " + test1.compareTo(test2));
		System.out.println("CompareTo: " + test1.compareTo(test3));
		
		
		Boy[] boys = {test1, test2, test3};
		
		System.out.println(Arrays.toString(boys));
		Arrays.sort(boys);
		System.out.println(Arrays.toString(boys));
	}

}
