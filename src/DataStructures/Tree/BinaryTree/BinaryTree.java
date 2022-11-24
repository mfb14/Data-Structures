package DataStructures.Tree.BinaryTree;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 22, 2022 8:52:45 AM
 */

class Node<E extends Object>{
	E data;
	Node<E> left;
	Node<E> right;
	protected Node(E data) {
		this.data=data;
		this.left=right=null;
	}
}
public class BinaryTree<E> {

	Node<E> root;
	
	public void insert(E data) {
		Node<E> newNode = new Node<E>(data);
		if(root==null)
			root=newNode;
	}
	// left,root,right
	private void traverseInorder(Node node) {
		if(node==null)
			return;
		traverseInorder(node.left);
		System.out.print(node.data+" ");
		traverseInorder(node.right);
		
	}
	public void traverseInorder() {
		traverseInorder(root);
	}
	//root,left,right
	private void traversePreOrder(Node node) {
		if(node==null)
			return;
		System.out.print(node.data+" ");
		traversePreOrder(node.left);
		traversePreOrder(node.right);
	}
	public void traversePreOrder() {
		traversePreOrder(root);
	}
	//left,right,root
	private void traversePostOrder(Node node) {
		if(node==null)
			return;
		traversePostOrder(node.left);
		traversePostOrder(node.right);
		System.out.print(node.data+" ");
		
	}
	public void traversePostOrder() {
		traversePostOrder(root);
	}
	
	
}



