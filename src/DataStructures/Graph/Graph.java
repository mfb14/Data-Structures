
package DataStructures.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Undirected Graph By AdjacencyList
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 10, 2022 1:49:19 PM
 */
public class Graph {

	private Integer V;
	private List<List<Integer>> adjacencyList;
	
	public Graph(Integer V) {
		this.V=V;
		adjacencyList=new ArrayList<>(V);
		for(Integer i=0;i<V;i++)
			adjacencyList.add(new ArrayList<>());
	}
	
	public Integer getV() {
		return this.V;
	}
	public List<List<Integer>> getAdjacencyList(){
		return this.adjacencyList;
	}
	/**
	 * This is an Undirected Graph Implementation, If we want to declare Directed Graph We just need to delete second line.
	 * @param source The source vertex. 
	 * @param destination The adjacent of the source vertex.
	 * */
	public void addEdge(Integer source,Integer destination) {
		adjacencyList.get(source).add(destination);
		adjacencyList.get(destination).add(source);
	}
	
	public void display() {
		  for (int i = 0; i < adjacencyList.size(); i++) {
		      System.out.println("\nVertex " + i + ":");
		      for (int j = 0; j < adjacencyList.get(i).size(); j++) {
		        System.out.print(" -> " + adjacencyList.get(i).get(j));
		      }
		      System.out.println();
		  }
	}
}
