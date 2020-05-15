package finitestatemachine2;

import java.util.ArrayList;

public class FSMPicker {
	//List nodes
		
		
	//checkt kans of text
	public static String gekozenMachine(DobbelNode eerstnode) {
		String nodeNaam = kansMachine(eerstnode);
		return nodeNaam;
	}
	
	
	
	public static String kansMachine(DobbelNode n0) {
		DobbelNode currentNode = n0;
		Boolean end = false;
		
		while (end == false){ /*Checkt of het getal een nummer is https://www.programiz.com/java-programming/examples/check-string-numeric*/
			try {
				Double num = Double.parseDouble(currentNode.getNodeNaam());
				end = true;
            
			} catch (NumberFormatException e) {
				currentNode = currentNode.nextLocatie();
			}
		}
		return currentNode.getNodeNaam();	
	}
	
	public static String textMachine(String input){
		Boolean end = false;
		ArrayList<String> path = new ArrayList<String>();
    	String bekekenletter = input.substring(0, 1); //pakt de 1ste letter, https://www.w3schools.com/jsref/jsref_substring.asp
        String overig = input.substring(1);
        String wholepath = "";
        TextNode node = null;
		
        for(int c = 0; c < input.length(); c++){
        	try {
            	node = node.nextLocatie(input.charAt(c));
            	wholepath += c;
        	} catch (ArrayIndexOutOfBoundsException e) {
        		end = true;
        		break;
        	}
        	

        }
		return wholepath;
        
        
//        	
//        	String bekekenletter = input.substring(0, 1); //pakt de 1ste letter, https://www.w3schools.com/jsref/jsref_substring.asp
//            String overig = input.substring(1);
//            if(getLocatiesprong().containsKey(bekekenletter)){ //checkt of waarde in hashmap bestaat
//                path = locatiesprong.get(bekekenletter).textMachine(overig); //run nog een keer met de overige letters
//                path.add(0, naam);
//                return path;
//            } else {//zo niet dan
//                throw new IllegalArgumentException("bij " + naam + " " + bekekenletter + " niet mogelijk is.");
//            }
//            
//        } else { //Dus het einde
//            return new ArrayList<>() {{
//                add(naam);
//            }};
//        }
	}
}
