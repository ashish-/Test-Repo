package com.kronos.day3.session1;

class Animal{
	void sound(){
		System.out.println("?");
	}
	
}


class Dog extends Animal{
	void sound(){
		System.out.println("bho bho");
	}
	
}


public class ArrayStoreException {
	
	
	public static void main(String[] args) {
		
		
		Dog []animals={new Dog(),new Dog()};
		
		notfunny(animals);
		
		
	}

	private static void notfunny(Dog[] animals) {
		
		animals[0]=new Dog();
		// TODO Auto-generated method stub
		
	}
}
