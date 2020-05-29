package dijkstrasPath3test1;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class KaartJtest2 {

	@Test
	public void test() {
	    { 
	        int V = 5; 
	        int source = 0; 
	  
	        // Adjacency list representation of the  
	        // connected edges 
	        List<List<Plaats> > adj = new ArrayList<List<Plaats> >(); 
	  
	        // Initialize list for every node 
	        for (int i = 0; i < V; i++) { 
	            List<Plaats> item = new ArrayList<Plaats>(); 
	            adj.add(item); 
	        } 
	  
	        // Inputs for the DPQ graph 
	        adj.get(0).add(new Plaats(1, 1)); 
	        adj.get(0).add(new Plaats(2, 6)); 
	        adj.get(0).add(new Plaats(3, 5)); 
	        adj.get(0).add(new Plaats(4, 3)); 
	  
	        adj.get(2).add(new Plaats(1, 2)); 
	        adj.get(2).add(new Plaats(3, 4)); 
	  
	        // Calculate the single source shortest path 
	        Kaart kaart = new Kaart(V); 
	        kaart.dijkstra(adj, source); 
	  
	        // Print the shortest path to all the nodes 
	        // from the source node 
	        System.out.println("The shorted path from node :"); 
	        System.out.println(source + " to " + 2 + " is " + kaart.getDist()[2]); 
	        
	          for (int i = 0; i < kaart.getDist().length; i++) { 
//	            System.out.println(source + " to " + i + " is "
//	                               + kaart.getDist()[i]); 
	        	System.out.println(kaart.getDist()[i]);
	        }
	    } 
	} 
	}


