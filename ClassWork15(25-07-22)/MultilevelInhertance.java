package oops;

class Animal  //grand Parent Class
{
	public void display()
	{
		System.out.println("Animals");
	}
}
class Dog extends Animal //Parent Class
{
	public void bark()
	{
		System.out.println("Dog is barking");
	}
}
class Puppy extends Dog    //Child Class
{
	public void puppy()
	{
		System.out.println("Child of dog");
		
	}
}

public class MultilevelInhertance 
{
	public static void main(String[] args)  //Main method
	{
		Puppy puppy=new Puppy();
		puppy.display();
		puppy.bark();
		puppy.puppy();
		
	}

}
