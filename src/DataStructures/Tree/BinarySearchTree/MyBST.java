
package DataStructures.Tree.BinarySearchTree;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 24, 2022 9:40:50 PM
 */
public class MyBST {

	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(15);
		tree.insert(20);
		tree.insert(10);
		tree.insert(12);
		tree.insert(8);
		tree.insert(5);
		tree.insert(11);
		tree.insert(14);
		tree.insert(16);
		tree.insert(23);
		tree.insert(18);
		tree.insert(29);
		
		tree.traverseInorder();
		tree.traversePostOrder();
		tree.traversePreOrder();
		
		System.out.println(tree.search(8));
		System.out.println(tree.getMax());
		System.out.println(tree.getMin());
	}

}
