
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
	
	public Node inserter(Node node,Integer key) {
		
		if(root==null) {
			root=new Node(key);
			return root;
		}
		
		if(key<node.key) 
			root.left=inserter(root.left,key);
		
		else if(key>node.key)
			root.right=inserter(root.right,key);
			
		
		return root;
	}
	
	public void display() {
		
		root.displayData();
	}

			
		
		
	
}
