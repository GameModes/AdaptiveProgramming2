package F2A;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {	
	private String naam;
	ArrayList<String> path = new ArrayList<String>();
	HashMap<String, Node> locatiesprong = new HashMap<String, Node>();
	
	public Node(String nm) {
		naam = nm;
	}

	public void setVerbinding(String letter, Node node) {
		locatiesprong.put(letter, node);
	}

	public ArrayList<String> FiniteStateMachine(String input){
        if(input.length() != 0){
        	String bekekenletter = input.substring(0, 1); //pakt de 1ste letter, https://www.w3schools.com/jsref/jsref_substring.asp
            String overig = input.substring(1);
            if(locatiesprong.containsKey(bekekenletter)){ //checkt of waarde in hashmap bestaat
                path = locatiesprong.get(bekekenletter).FiniteStateMachine(overig); //run nog een keer met de overige letters
                path.add(0, naam);
                return path;
            } else {//zo niet dan
                throw new IllegalArgumentException("bij " + naam + " " + bekekenletter + " niet mogelijk is.");
            }
            
        } else { //Dus het einde
            return new ArrayList<>() {{
                add(naam);
            }};
        }
	}
}

	
	
	
	

