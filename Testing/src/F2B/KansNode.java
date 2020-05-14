package F2B;

import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Math; 
import java.util.Map;

public class KansNode {
	ArrayList<KansNode> kanzen = new ArrayList<KansNode>();
	HashMap<KansNode, Double> locatiesprong = new HashMap<KansNode, Double>();
	private double random = Math.random();
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
		  System.out.println(random3);
		  Double lagerdan = 0.0;
		  
		  KansNode volgendenode = null;
		  
		  boolean gevondenlager = false;
		  
		      for(int c = 0; c < locatiesprong.size(); c++){
		    	  Double locatievalue = locatiesprong.get(locatiesprong.keySet().toArray()[c]);
		    	  if(locatievalue > random3 && gevondenlager == false){
		    		  lagerdan = locatievalue;
		    		  gevondenlager = true;
		    		  
		    	  }
		          for(Map.Entry entry: locatiesprong.entrySet()){
		              if(lagerdan.equals(entry.getValue())){
		            	  volgendenode = (KansNode) entry.getKey();
		                  break;
		              }
		          }
		      }
		      System.out.println(lagerdan);
		      return volgendenode;
		}

		
		

	}

	
	
