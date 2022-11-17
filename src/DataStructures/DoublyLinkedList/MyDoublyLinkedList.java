
package DataStructures.DoublyLinkedList;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 16, 2022 10:23:42 AM
 */
public class MyDoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedList<String> doubly = new DoublyLinkedList<String>();
		
		
		doubly.addFirst("One");
		doubly.addLast("Two");
		doubly.addLast("Three");
		doubly.addLast("Four");
		doubly.addLast("Five");
		doubly.addLast("Six");
		doubly.deleteLast();
		doubly.display();
		
	}

}
