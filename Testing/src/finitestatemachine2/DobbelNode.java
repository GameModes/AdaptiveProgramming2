package finitestatemachine2;

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

public class DobbelNode {
	ArrayList<DobbelNode> kansen = new ArrayList<DobbelNode>();
	HashMap<DobbelNode, Double> locatieSprong = new HashMap<DobbelNode, Double>();
	private String nodeNaam;
	private Boolean endState;


	public DobbelNode(String nn, boolean es) {
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



	public void setVerbinding(DobbelNode nummer, double kansnummer) {
		locatieSprong.put(nummer, kansnummer);
		
	}
	
	public HashMap mapSorter(HashMap locatieSprong) { //Source: https://beginnersbook.com/2013/12/how-to-sort-hashmap-in-java-by-keys-and-values/
	       List list = new LinkedList(locatieSprong.entrySet()); //sort hashmap by values
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
		return sortedHashMap; 
	}
	
	
	
	public DobbelNode nextLocatie() {
		  Double random3 = Math.random(); 
		  Double lagerdan = 0.0;
		  locatieSprong =  mapSorter(locatieSprong);
		  
		  DobbelNode volgendenode = null; //Vind de volgende node met random
		  boolean gevondenlager = false;
		      for(int c = 0; c < locatieSprong.size(); c++){
		    	  Double locatievalue = locatieSprong.get(locatieSprong.keySet().toArray()[c]);
		    	  if(locatievalue > random3 && gevondenlager == false){
		    		  lagerdan = locatievalue;
		    		  gevondenlager = true;
		    		  
		    	  }
		          for(Map.Entry x: locatieSprong.entrySet()){ //Krijg de key van de gevonden value
		              if(lagerdan.equals(x.getValue())){
		            	  volgendenode = (DobbelNode) x.getKey();
		                  break;
		              }
		          }
		      }
		      return volgendenode;
		}

		
		

	}

	
	
