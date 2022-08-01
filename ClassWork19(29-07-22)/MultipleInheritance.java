package abstractiondemo;

//abstract class
abstract class A
{
	abstract void display();// abstract method
	public void demo()// concrete method
	{
		System.out.println("abstract class");
	}
	}
interface In 	//interface in
{
	int add(int a,int b);
	}
class Child extends A implements In //class child implements interface in and extends class A
{
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Ans is: ");
	}
	}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child cal=new Child();
		cal.display();
		int sum=cal.add(5,7);
		System.out.println(sum);
		cal.demo();
	}

}
