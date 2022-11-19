
package DataStructures.Queue;



/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 19, 2022 6:43:00 AM
 */
public class MyQueue {

	public static void main(String[] args) {

		Queue <String>  myQueue= new Queue<>();
		myQueue.enqueue("Hello");
		myQueue.enqueue("Furkan");
		myQueue.enqueue("Whats'up");
		myQueue.enqueue("How are you?");
		myQueue.enqueue("Come and Claim");
		myQueue.dequeu();
		myQueue.display();
		myQueue.peek();
		
		
	}

}
