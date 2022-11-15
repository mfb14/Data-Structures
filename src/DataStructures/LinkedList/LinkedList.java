
package DataStructures.LinkedList;

import java.rmi.dgc.VMID;

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
public class LinkedList {
	//[data|next] struct type of Node. Hold data and references of next data
	private Node head;
	
	public <T> void addFirst(T data) {
		Node newHead = new Node(data,null);
		newHead.next=head;
		head=newHead;
	}
	public <T> void addLast(T data) {
		Node current = head;
		while(current.next!=null)
			current=current.next;
		current.next=new Node(data,null);
		
	}
	
	public void displayLinkedList() {
		System.out.println("\nPrinting Linked List ...");
		Node current = head;
		//Until the last element (Because last element shows null)
		while (current != null) {
			current.displayData();
			current = current.next;
		}
	}
	
    public void deleteFirst() {
        Node temp = head;
        head = head.next;
        System.out.println("\n----------------------------------------\n");
        System.out.println("The data "+temp.data+" has been deleted!");
        System.out.println("\n----------------------------------------\n");
    }
	
	public void deleteLast() {
		Node current = head;
		
		while(current.next.next!=null)
			current=current.next;
		
		Node temp = current.next;
		current.next=null;
		
        System.out.println("\n----------------------------------------\n");
        System.out.println("The data "+temp.data+" has been deleted!");
        System.out.println("\n----------------------------------------\n");
	
		
	}
	
}
