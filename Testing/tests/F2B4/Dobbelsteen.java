package F2B;

public class Dobbelsteen {
	//List nodes
	
	
	
	public static String bouwDobbelsteen(KansNode node) {
		KansNode currentNode = node;
		while (currentNode.getEndState() == false) {
			System.out.println("test");
			if (currentNode.getEndState() == true) {
				
				break;
			}
			else {
				currentNode = currentNode.NextLocatie();
			}
		}
	if (currentNode.getEndState() == true) {
		return currentNode.getNodeNaam();
	}
	else {
		return "Bij elkaar niet 1";
	}
	
	
	
	
	}
	//Bouwdobbelsteen(aantalogen):
	// for loop door range zijdes
		//maak voor elk zijde een node
		//zet elke zijde nummer in een array
	// for loop n door arraylist
		//S1 maakt verbinding voor N
}
