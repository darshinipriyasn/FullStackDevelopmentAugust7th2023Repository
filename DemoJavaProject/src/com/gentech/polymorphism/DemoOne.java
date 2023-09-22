package com.gentech.polymorphism;
abstract class Animals
{
	abstract void voice();
}
class Lion extends Animals
{
	void voice() {
		System.out.println("Lion communicates with Roaring");
	}
}
class Dog extends Animals
{
	void voice() {
		System.out.println("Dog communicates with Barking");
	}
}
class Cat extends Animals
{
	void voice() {
		System.out.println("Cat communicates with meows,chatters");
	}
}
public class DemoOne {
	public static void main(String[] args) {
		Animals animal=null;
		Lion lee=new Lion();
		Dog puppy=new Dog();
		Cat pussy=new Cat();
		
		animal=lee;
		animal.voice();
		animal=puppy;
		animal.voice();
		animal=pussy;
		animal.voice();
	}

}
