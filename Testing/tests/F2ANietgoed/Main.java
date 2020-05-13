package F2ANietgoed;

public class Main {
	
	public static void main(String[] args) {
		Nodes woord1 = new Nodes("BAAB"); //Opdracht voorbeeld
		System.out.println(woord1.getPath());
		Nodes woord2 = new Nodes("AAAB"); //Als s2 een A krijgt
		System.out.println(woord2.getPath());
	}
}
