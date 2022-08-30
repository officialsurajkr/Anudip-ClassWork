package collectionframework;

import java.util.Stack;

public class StackEx 
{
	public static void main(String[] args)
	{
		Stack<Integer>stack=new Stack<Integer>();
	
					stack.push(12);
					stack.push(22);
					stack.push(32);
					stack.push(42);
					stack.push(52);
					
					System.out.println(stack);
		//pop()- will remove last element of stack			
					stack.pop();    
					System.out.println(stack);
					
					System.out.println(stack.search(52)); //if element not present it will return -1
					System.out.println(stack.search(12)); //it will give the position from backward direction
	
	
	//peek()-it will remove top of stack and store in another variable
				int i =stack.peek();
				System.out.println(i);
	
	}
	

}
