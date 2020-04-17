package F1;

import java.time.LocalDate;

public class MainGame {

	public static void main(String[] args) {
		int releaseJaar1 = LocalDate.now().getYear() - 1;
		int releaseJaar2 = LocalDate.now().getYear() - 2;

		Game g1 = new Game("Just Cause 3", 49.98, releaseJaar1);
		Game g2 = new Game("Need for Speed", 45.99, releaseJaar2);
		Game g3 = new Game("Need for Speed", 45.99, releaseJaar2);
		
        Player p1 = new Player("Eric", 200);
        Player p2 = new Player("Hans", 55);
        Player p3 = new Player("Arno", 185);
         
        System.out.println("p1 koopt g1: " +  p1.koop(g1));
        System.out.println("p1 koopt g2: " +  p1.koop(g2));
        System.out.println("p1 koopt g3: " +  p1.koop(g3));
        System.out.println("p2 koopt g2: " +  p2.koop(g2));
        System.out.println("p2 koopt g1: " +  p2.koop(g1));
        System.out.println("p3 koopt g3: " +  p3.koop(g3) + "\n");
        
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());
        
        System.out.println("p1 verkoopt g1 aan p3: " +  p1.verkoop(g1, p3));
        System.out.println("p2 verkoopt g2 aan p3: " +  p2.verkoop(g2, p3));
        System.out.println("p2 verkoopt g1 aan p1: " +  p3.verkoop(g3, p1) + "\n");

        
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("p3: " + p3.toString());
	}

}
