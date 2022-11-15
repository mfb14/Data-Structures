
package DataStructures.LinkedList;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 15, 2022 5:30:25 PM
 */
public class MyLinkedList {


	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addFirst("Merhaba");
		list.addFirst(45);
		
		list.addFirst(true);
		list.addFirst(Math.PI);
		list.addLast("Dünya");
		list.displayLinkedList();
		list.deleteLast();
		list.displayLinkedList();
		
		
	}


}
