package abstractiondemo;

//We cannot create object
interface Printablee
{
	int x=100;
	void display();//abstract by default
	void fun();
	}
interface Drawablee extends Printablee{
	void draw();
}
interface sayable{
	void say();
}
class Print implements Drawablee
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display the msg");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Fun learning");
	}
	
	public void draw()
	{
		System.out.println("draw something");
	}
	}
class Message implements Drawablee,sayable
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("I'm doing fun");
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw circle");
	}
	}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print p=new Print();
		p.display();
		p.fun();
		p.draw();
		Message msg=new Message();
		msg.display();
		msg.fun();
		msg.say();
		msg.draw();
	
	}

}
