package object;
//package ru.itsjava.java_online.object;

//import object.Dog;

public class ObjectPractice {
 
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
 
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2)); // сравниваем два разных объекта
 
		obj2 = obj1; // ссылаемся на один и тотже объект
		System.out.println(obj1.equals(obj2));
 
		Dog gurka = new Dog("Gurka", 10);
		Dog gurka2 = new Dog("Gurka", 10);
		Dog murka = new Dog("Murka", 5);
 
		System.out.println("gurka.equals(gurka2): " + gurka.equals(gurka2));
		System.out.println("gurka.equals(murka): " + gurka.equals(murka));
 
		System.out.println(gurka);
	}
 
}