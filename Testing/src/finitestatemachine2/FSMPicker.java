package finitestatemachine2;

public class FSMPicker {
	//List nodes
	
		
	
	public static String bouwDobbelsteen(DobbelNode n0) {
		DobbelNode currentNode = n0;
		
		while (currentNode.getEndState() == false) {
			currentNode = currentNode.nextLocatie();
			
		}

		return currentNode.getNodeNaam();
	}
}
