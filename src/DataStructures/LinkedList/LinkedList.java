
package DataStructures.LinkedList;


/**
 * 
 *
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 15, 2022 11:10:00 AM
 */

class  Node<T extends Object> {
	protected T data;
	protected Node next;
	
	protected Node(T data,Node next) {
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
		Node <T>newHead = new Node<T>(data,null);
		newHead.next=head;
		head=newHead;
	}
	public void addLast(T data) {
		Node <T>iter = head;
		while(iter.next!=null)
			iter=iter.next;
		iter.next=new Node<T>(data,null);
	}

	/**
	 * Adding elements to linked list after specific data.
	 * 
	 * @param data  element to be added
	 * @param addAfter add after this element
	 * 
	 * @throws RuntimeException if addAfter is equal to null
	 * */
	public void addAfter(T data,T addAfter) {
		
		if(head==null)
			throw new RuntimeException("The Linked List is Empty!!");
		
		Node<T> iter = head;
		Node<T> newNode = new Node(data, null);
		Node<T> temp;
		while(iter.data!=null) {
			iter=iter.next;
			if(iter.data==addAfter)
				break;
		}
		
		temp=iter.next;
		newNode.next=temp;
		iter.next=newNode;
		
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
	/**
	 * Search given element
	 * */
	private boolean search(Node head,T addAfter) {
		Node iter = head;
		while(iter!=null) {
			
			if((T)iter.data == (T)addAfter)
				return true;
		
			iter=iter.next;
		}
		return false;
	}
	/**
	 * Delete given elements from the list if It is in th list
	 * @param data Element to be deleted
	 * */
	public void delete(T data) {
		Node<T> iter = head;
		Node<T> temp;
		if(search(iter, data)==false)
			System.out.println("The data "+data+" is not in list!");
		
		while(iter.next.data!=data) {
			iter=iter.next;
		}
		temp=iter.next.next;
		iter.next=temp;
		
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
