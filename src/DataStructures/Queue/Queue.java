
package DataStructures.Queue;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 19, 2022 6:42:50 AM
 */
class Node <E extends Object>{
	protected E data;
	protected Node next;
	protected Node(E data) {
		this.data=data;
		this.next=null;
	}
	
	protected void displayData() {
		System.out.println("["+data+"|"+next+"]");
	}
}
public class Queue<E> {
	private Node head;
	private Node tail;
	
	public void enqueue(E data) {
		Node<E> newNode = new Node<E>(data);
		if(head==null) {
			head=newNode;
			tail=head;
		}
		else {
			tail.next=newNode;
			tail=tail.next;
		}
	
	}
	public void dequeu() {
		if(head==null)
			throw new RuntimeException("The queu is empty!");
		
		E temp = (E) head.data;
		head=head.next;
		System.out.println("The data "+temp+" has been deleted from Queue");
	
			
	}
	public void peek() {
		System.out.println("\n"+head.data);
	}
	public void display() {
		if(head==null)
			throw new RuntimeException("The queeu is empty! Please add element to Qeueu!");
		
		Node<E> iter = head;
		while(iter!=null) {
			iter.displayData();
			iter=iter.next;
		}
			
	}

}
