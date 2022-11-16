
package DataStructures.DoublyLinkedList;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 16, 2022 10:23:42 AM
 */
public class MyDoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedList<String> doubly = new DoublyLinkedList<String>();
		
		
		doubly.addFirst("Furkan");
		doubly.addFirst("Hello");
		doubly.addFirst("Try");
		doubly.addFirst("Try2");
		doubly.addLast("What's up!");
		doubly.addLast("How are you?");
		doubly.deleteFirst();
		doubly.display();
		
	}

}
