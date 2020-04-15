package AP2;

public class Main {
	public static void main(String[] args) {
		String voornaam = "david";
		voornaam = "lukas";
		
		Schaap schaap = new Schaap (voornaam);
		Schaap schaap2 = new Schaap ("Henk");
		
		Weide weide = new Weide ("Polder");
		weide.schapen.add(schaap);
		weide.schapen.add(schaap2);
		

		
		System.out.println(schaap.toString);
		
		System.out.println("Hello world");
	}
}
