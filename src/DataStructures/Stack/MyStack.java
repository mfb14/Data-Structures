
package DataStructures.Stack;

import java.util.Vector;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 18, 2022 10:26:54 AM
 */
public class MyStack {

	
	public static void main(String[] args) {

		Stack myStack = new Stack();
		myStack.push(10);
		myStack.push("plus");
		myStack.push(20);
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.display();
		

	
	}

}
