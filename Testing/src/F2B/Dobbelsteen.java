package F2B;

public class Dobbelsteen {
	//List nodes
	
		
	
	public static String bouwDobbelsteen(KansNode node) {
		KansNode currentNode = node;
		
		while (currentNode.getEndState() == false) {
			currentNode = currentNode.NextLocatie();
			
		}

		return currentNode.getNodeNaam();
	}
}
