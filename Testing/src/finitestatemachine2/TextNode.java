package finitestatemachine2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TextNode {
	private String naam;
	ArrayList<String> path = new ArrayList<String>();
	HashMap<String, TextNode> locatiesprong = new HashMap<String, TextNode>();
	private String bekekenLetter;
	private TextNode currentNode;
	
	public TextNode getCurrentNode() {
		return currentNode;
	}

	public void setCurrentNode(TextNode currentNode) {
		this.currentNode = currentNode;
	}

	public String getBekekenletter() {
		return bekekenLetter;
	}

	public void setBekekenletter(String bekekenletter) {
		this.bekekenLetter = bekekenletter;
	}

	public TextNode(String nm) {	
		naam = nm;
	}

	public ArrayList<String> getPath() {
		return path;
	}

	public void setPath(ArrayList<String> path) {
		this.path = path;
	}

	public HashMap<String, TextNode> getLocatiesprong() {
		return locatiesprong;
	}

	public void setLocatiesprong(HashMap<String, TextNode> locatiesprong) {
		this.locatiesprong = locatiesprong;
	}

	public void setVerbinding(String letter, TextNode node) {
		locatiesprong.put(letter, node);
	}
	
	public TextNode nextLocatie(char input) {
		String stringInput = String.valueOf(input);
		if(locatiesprong.containsKey(stringInput)){ //checkt of waarde in hashmap bestaat
			currentNode = locatiesprong.get(stringInput);
			TextNode node = getCurrentNode().locatiesprong.get(stringInput);
            } else {//zo niet dan
                throw new IllegalArgumentException("bij " + naam + " " + bekekenLetter + " niet mogelijk is.");
            }
            
         return currentNode;
        
	}
	
	
}

	
	
	
	

