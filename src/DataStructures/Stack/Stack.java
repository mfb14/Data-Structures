
package DataStructures.Stack;


/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 18, 2022 10:00:20 AM
 */

class  Node<T extends Object>{
	protected T data;
	protected Node next;
	
	Node (T data){
		this.data=data;
		this.next=null;
	}
	protected void displayData() {
		
		System.out.println("["+data+"|"+next+"]");
	}
}
public class Stack<T> {

	private Node head;
	public void push(T data) {
		
		Node<T> newNode = new Node<T>(data);
		Node iter = head;
		if(head==null) {
			head=newNode;
		}
		else {
		while(iter.next!=null) 
			iter=iter.next;
		iter.next=newNode;
		}
		
		
	}
	public void pop() {
		
		if(head==null)
			throw new RuntimeException("Stack is already empty!");
		else if (head.next==null) {
			Node <T> temp = head;
			head=null;
			System.out.println("The data "+temp.data+" has been deleted!");
			System.out.println("The Stack is empty now!");
		}
		else {
			Node <T> iter = head;	
			while(iter.next.next!=null) 
				iter=iter.next;		
			System.out.println("The data "+ iter.next.data+" has been deleted");
				iter.next=null;
		}

		
		
	}
	
	public void display() {
		
		Node<T> iter = head;
		//Until the last element (Because last element shows null)
		while (iter != null) {
			iter.displayData();
			iter = iter.next;
		}
	}
	

}
