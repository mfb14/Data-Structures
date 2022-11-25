
package DataStructures.Tree.BinarySearchTree;


/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Nov 24, 2022 12:33:27 PM
 */

class Node{
	
	protected Integer key;
	protected Node left;
	protected Node right;
	
	protected Node(Integer key) {
		this.key = key;
		this.left=this.right=null;
	}
	
	protected void displayData() {
		System.out.print(key+" ");
	}
}
public class BinarySearchTree{
	
	private Node root;
	public void insert(Integer key) {
		root = inserter(root,key);
	}
	
	public Node inserter(Node root,Integer key) {
		
		if(root==null) {
			root=new Node(key);
			return root;
			
		}
		if(key<=root.key) {
			root.left=inserter(root.left,key);
			return root;
		}

		root.right=inserter(root.right,key);	
		return root;
		
	}
	public void traverseInorder() {
		Inorder(root);
		System.out.println("\n");
	}
	public void traversePostOrder() {
		Postorder(root);
		System.out.println("\n");
	}
	public void traversePreOrder() {
		Preorder(root);
		System.out.println("\n");
	}
	private void Inorder(Node root) {
		if (root != null) {
			Inorder(root.left);
		   root.displayData();
		   Inorder(root.right);
		  }
	}
	private void Postorder(Node root) {
		if(root!=null) {
			Postorder(root.left);
			Postorder(root.right);
			root.displayData();
		}
	}
	private void Preorder(Node root) {
		if(root!=null) {
			root.displayData();
			Preorder(root.left);
			Preorder(root.right);
		}
	}

		
		
		
	
}
