
package DataStructures.LinkedList;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 15, 2022 5:30:25 PM
 */
public class MyLinkedList {


	public static void main(String[] args) {
		
		LinkedList<Object> list = new LinkedList();
		list.addFirst("Merhaba");
		list.addLast(45);
		list.addLast(true);
		list.addLast(Math.PI);
		list.addLast("Dünya");
		list.addLast("How");
		list.addLast("is");
		list.addLast("your");
		list.addLast("brother");

		list.addAfter("Add", "your");
		
		list.delete("is");
		list.displayLinkedList();
		
		
	}


}
