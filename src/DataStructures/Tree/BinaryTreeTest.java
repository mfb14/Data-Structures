
package DataStructures.Tree;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 22, 2022 10:25:38 AM
 */
public class BinaryTreeTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree<Integer> bTree = new BinaryTree<>();
		bTree.root=new Node(4);
		bTree.root.left=new Node(8);
		bTree.root.right=new Node(9);
		bTree.root.right.right=new Node(6);
		bTree.root.left.right= new Node(7);
		bTree.root.left.left=new Node(3);
		
//				4
//			   / \
//			  8   9
//			 / \   \
//			3   4   6
		
		bTree.traverseInorder();//3-8-4-4-9-6
		System.out.println("\n---------------------");
		bTree.traversePreOrder();//4-8-3-4-9-6
		System.out.println("\n---------------------");
		bTree.traversePostOrder();//3-4-8-6-9-4
	}

}
