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
	public boolean search(Integer key) {
		return searcher(root,key);
	}
	private boolean searcher(Node root,Integer key) {
		if(root==null)
			return false;
		if(root.key==key)
			return true;
		if(searcher(root.left,key)==true)
			return true;
		if(searcher(root.right,key)==true)
			return true;
		
		return false;
			
	}
	/**
	 * When deleting Node in BST, there are three states.
	 * 1. The value is in the one of the leaf nodes, we simply delete the node.
	 * 2. If value is in the one of the middle ware nodes we equate to one of the child node to the deleted one.
	 * 3. If Node to be deleted has two child and, child's has children like root node, we have two states
	 *    3.1) We put back the highest node in the left child to the deleted node.
	 *    3.2) We put back the lowest node in the right child to the deleted node. 
	 * */
	public void delete(int value) {
		if(!search(value))
			System.out.println("The value does not exist in the BST!");
		
		deleteNode(root,value);
	}
	private Node deleteNode(Node root,int value) {
		if(root==null) 
			return root;
		
		if(root.key>value)
			root.left = deleteNode(root.left, value);
		else if(root.key<value)
			root.right = deleteNode(root.right, value);
		else {
			//If node to be deleted has two children
			if(root.left!=null&&root.right!=null) {
				Node iter = root;
				//Find minimum value of the right subtree &&
				//Replace current node with minimum node from right subtree
				root.key = minValue(iter.right);

				//Delete minimum node from the right subtree
				root.right =deleteNode(root.right, root.key);
				return root;
			}
			//If Node has only left child
			if(root.left!=null&&root.right==null)
				root=root.left;
			//If Node has only right child
			if(root.right!=null&&root.left==null)
				root=root.left;
			//If Node to be deleted has no child or is leaf node
			else {
				root=null;
			}
		}
			return root;
	}
	private int minValue(Node root) {
		while(root.left!=null)
			root=root.left;
		
		return root.key;
		
	}
	private int maxValue(Node root) {
		Node iter = root;
		while(iter.right!=null) {
			iter=iter.right;
		}
		return iter.key;
	}
	public int getMax() {
		return maxValue(root);
	}
	public int getMin() {
		return minValue(root);
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
