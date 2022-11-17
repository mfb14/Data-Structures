
package DataStructures.DoublyLinkedList;



/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 16, 2022 10:19:54 AM
 */

class  Node<T extends Object>{
	Node next;
	Node prev;
	T data;
	protected Node(T data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
	public void displayData() {
		
		if(next==null)
			System.out.print("["+prev+"|"+data+"|"+next+"]");
		else 							//To get references of 
			System.out.print("["+prev+"|"+data+"|"+next+"] ---->\n");
	}
}
public class DoublyLinkedList<T> {

	private Node head;
	public void addFirst(T data){
		Node<T> newHead = new Node<T>(data);
		
		newHead.next=head;
		if(head!=null)
			head.prev=newHead;	
		head=newHead;
	}
	public void addLast(T data) {
		Node<T> iter = head;
		while(iter.next!=null)
			iter=iter.next;
		
		Node<T> newNode = new Node<T>(data);
		iter.next=newNode;
		newNode.prev=iter;
		newNode.next=null;
	}
	
	public void deleteFirst() {
		if(head==null)
			 throw new RuntimeException("Doubly linked list is already empty");
		
		head=head.next;
		head.prev=null;
	}
	public void deleteLast() {
		Node iter = head;
		while(iter.next!=null)
			iter=iter.next;
		
		iter.prev.next=null;
		
		
	
		
		
	}
	public void display() {
		System.out.println("\nPrinting Linked List ...");
		Node<T> iter = head;
		//Until the last element (Because last element shows null)
		while (iter != null) {
			iter.displayData();
			iter = iter.next;
		}
	}
}
