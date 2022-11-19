
package DataStructures.LinkedList;


/**
 * 
 *
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 15, 2022 11:10:00 AM
 */

class  Node<T extends Object> {
	public T data;
	public Node next;
	
	public Node(T data,Node next) {
		this.data=data;
		this.next=next;
	}
	
	public void displayData() {
		
		if(next==null)
			System.out.print("["+data+"|"+next+"]");
		else 							//To get references of 
			System.out.print("["+data+"|"+next+"] ---->");
	}
}
public class LinkedList <T>{
	//[data|next] struct type of Node. Hold data and references of next data
	private Node head;
	
	public  void addFirst(T data) {
		Node <T>newHead = new Node(data,null);
		newHead.next=head;
		head=newHead;
	}
	public void addLast(T data) {
		Node <T>iter = head;
		while(iter.next!=null)
			iter=iter.next;
		iter.next=new Node(data,null);
		
	}
	public void addAfter(T data,T toAdd) {
		
	}
	public void displayLinkedList() {
		System.out.println("\nPrinting Linked List ...");
		Node<T> iter = head;
		//Until the last element (Because last element shows null)
		while (iter != null) {
			iter.displayData();
			iter = iter.next;
		}
	}
	
    public void deleteFirst() {
        Node<T> temp = head;
        head = head.next;
        System.out.println("\n----------------------------------------\n");
        System.out.println("The data "+temp.data+" has been deleted!");
        System.out.println("\n----------------------------------------\n");
    }
	
	public void deleteLast() {
		Node<T> iter = head;
		
		while(iter.next.next!=null)
			iter=iter.next;
		
		Node<T> temp = iter.next;
		iter.next=null;
		
        System.out.println("\n----------------------------------------\n");
        System.out.println("The data "+temp.data+" has been deleted!");
        System.out.println("\n----------------------------------------\n");
	
		
	}
	
}
