package F2B;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.lang.Math; 
import java.util.Map;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class KansNode {
	ArrayList<KansNode> kanzen = new ArrayList<KansNode>();
	HashMap<KansNode, Double> locatiesprong = new HashMap<KansNode, Double>();
	private String nodeNaam;
	private Boolean endState;


	public KansNode(String nn, boolean es) {
		nodeNaam = nn;
		endState = es;
		
	}


	public Boolean getEndState() {
		return endState;
	}


	public void setEndState(Boolean endState) {
		this.endState = endState;
	}


	public String getNodeNaam() {
		return nodeNaam;
	}



	public void setVerbinding(KansNode nummer, double kansnummer) {
		locatiesprong.put(nummer, kansnummer);
		
	}
	

	
	public KansNode NextLocatie() {
			
		  Double random3 = Math.random(); 
		  Double lagerdan = 0.0;
		  
	       List list = new LinkedList(locatiesprong.entrySet()); //sort hashmap by values
	       Collections.sort(list, new Comparator() {
	            public int compare(Object o1, Object o2) {
	               return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	       HashMap sortedHashMap = new LinkedHashMap();
	       for (Iterator it = list.iterator(); it.hasNext();) {
	              Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       locatiesprong = sortedHashMap;
		  //Source: https://beginnersbook.com/2013/12/how-to-sort-hashmap-in-java-by-keys-and-values/
		  
		  
		  
		  
		  KansNode volgendenode = null; //Vind de volgende node met random
		  boolean gevondenlager = false;
		      for(int c = 0; c < locatiesprong.size(); c++){
		    	  Double locatievalue = locatiesprong.get(locatiesprong.keySet().toArray()[c]);
		    	  if(locatievalue > random3 && gevondenlager == false){
		    		  lagerdan = locatievalue;
		    		  gevondenlager = true;
		    		  
		    	  }
		          for(Map.Entry x: locatiesprong.entrySet()){ //Krijg de key van de gevonden value
		              if(lagerdan.equals(x.getValue())){
		            	  volgendenode = (KansNode) x.getKey();
		                  break;
		              }
		          }
		      }
		      return volgendenode;
		}

		
		

	}

	
	
