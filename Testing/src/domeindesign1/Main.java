package domeindesign1;

public class Main {

	public static void main(String[] args) {
		NPC n1 = new NPC("Agatha");
		Trainer t1 = new Trainer("Agatha", 9, false, true);
		n1.setTrainer(t1);
		Elitefour e1 = new Elitefour("Ghost");
		t1.setElitefourrol(e1);
		Route r1 = new Route(8, "Regenachtig");
		n1.setRoute(r1);
		Pokemons p94 = new Pokemons("Gengar", "Ghost");
		Pokemons p42 = new Pokemons("Golbat", "Flying");
		Pokemons p24 = new Pokemons("Arbok", "Poison");
		t1.getPokemons(p94);
		t1.getPokemons(p42);
		t1.getPokemons(p24);
		t1.getPokemons(p94);
		t1.getPokemons(p94);
		System.out.println(n1.toString());
		e1.setAchievement();
		System.out.println("---------------------------------------------------------------------------");
		
		NPC n2 = new NPC("Brock");
		Trainer t2 = new Trainer("Brock", 9, true, false);
		n2.setTrainer(t2);
		Gymleader g1 = new Gymleader("Rock", "Rockbadge");
		t2.setGymleaderrol(g1);
		Route r2 = new Route(12, "Zonnig");
		n2.setRoute(r2);
		Items i18 = new Items("Hyper Potion", "Medicine");
		Pokemons p74 = new Pokemons("Geodude", "Rock");
		Pokemons p95 = new Pokemons("Onix", "Rock");
		n2.getItems(i18);
		t2.getPokemons(p74);
		t2.getPokemons(p95);
		System.out.println(n2.toString());
		g1.setAchievement();
		System.out.println("---------------------------------------------------------------------------");
		
		NPC n3 = new NPC("Ash");
		Trainer t3 = new Trainer("Ash", 2, false, false);
		n3.setTrainer(t3);
		Route r3 = new Route(4, "Bewolkt");
		n3.setRoute(r3);
		Pokemons p25 = new Pokemons("Pikachu", "Electric");
		Pokemons p122 = new Pokemons("Mr. Mime", "Psychic");
		Pokemons p149 = new Pokemons("Dragonite", "Dragon");
		Pokemons p447 = new Pokemons("Riolu", "Fighting");
		Items i15 = new Items("Paralyz Heal", "Medicine");
		Items i16 = new Items("Full Restore", "Medicine");
		t3.getPokemons(p25);
		t3.getPokemons(p94);
		t3.getPokemons(p122);
		t3.getPokemons(p149);
		t3.getPokemons(p447);
		n3.getItems(i18);
		n3.getItems(i15);
		System.out.println(n3.toString());
		System.out.println("---------------------------------------------------------------------------");
		
		NPC n4 = new NPC("Sister Joy");
		Vendor v1 = new Vendor(true);
		n4.setVendor(v1);
		n4.getItems(i16);
		n4.getItems(i16);
		n4.getItems(i16);
		n4.getItems(i16);
		n4.getItems(i16);
		n4.getItems(i16);
		System.out.println(n4.toString());
		System.out.println("---------------------------------------------------------------------------");
		
		NPC n5 = new NPC("Technology-is-amazing guy");
		Vendor v2 = new Vendor(true);
		n5.setVendor(v2);
		Items t59 = new Items("Dream Eater", "TM");
		n5.getItems(t59);
		Route r15 = new Route(15, "Zonnig");
		n5.setRoute(r15);
		System.out.println(n5.toString());
	}

}
