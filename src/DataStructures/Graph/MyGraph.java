
package DataStructures.Graph;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 10, 2022 3:37:04 PM
 */
public class MyGraph {

	
	public static void main(String[] args) {
		
		Graph graph = new Graph(8);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 6);
		graph.addEdge(3, 5);
		graph.addEdge(5, 6);
		graph.addEdge(2, 7);
		graph.addEdge(6, 7);
		graph.display();


	}

}
