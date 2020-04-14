
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double breedte;
		double lengte;
		double diepte;
		double inhoud;
		
		breedte = 2.0;
		lengte = 5.5;
		diepte = 1.5;
		
		System.out.println("breedte: " + breedte);
		System.out.println("lengte: " + lengte);
		System.out.println("diepte: " + diepte);
		
		inhoud = lengte * breedte * diepte;
		
		System.out.println("inhoud: " + inhoud + "");
		
		breedte = 2.5;
		lengte = 100;
		diepte = 2;
		
		System.out.println("Gegevens zwembad: dit zwembad is " + breedte + "m breed, " + lengte + "m lang, en " + diepte + "m diep");

		
		inhoud = lengte * breedte * diepte;
		
		System.out.println("inhoud: " + inhoud);
			
		}

	}


