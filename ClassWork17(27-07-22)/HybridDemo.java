
//W.A.P to implement multilevel as well as hierarchical inheritance in same program 

package abstractiondemo;

class ClassA
{
	public void method1()
	{
		System.out.println("This is ClassA Property");	
	}
}

class ClassB extends ClassA
{
	public void method2()
	{
		System.out.println("Using ClassA Property in ClassB");
	}
}

class ClassC extends ClassB
{
	public void method3()
	{
		System.out.println("Using ClassB Property in ClassC");
	}
}

class ClassD extends ClassB
{
	public void method4()
	{
		System.out.println("Using ClassB Property in ClassD");
	}
}



public class HybridDemo 
{
	public static void main(String[] args)
	{
		
		ClassC obj=new ClassC();
				obj.method1();
				obj.method2();
				obj.method3();
				
				
				ClassD obj1=new ClassD();
						obj1.method2();
						obj1.method4();
					
		
		
		
				
				
		
	}

}
