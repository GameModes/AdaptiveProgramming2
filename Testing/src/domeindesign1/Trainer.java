package domeindesign1;

import java.util.ArrayList;

public class Trainer extends NPC{
	private int badges;
	private Pokemons pokemons;
	private boolean gymleader;
	private Gymleader gymleaderrol;
	private Elitefour elitefourrol;
	private boolean elitefour;
	ArrayList<String> bezitpokemons = new ArrayList<String>();
	
	public Trainer(String nm, int bd, boolean gl, boolean ef) {
		super(nm);
		badges = bd;
		gymleader = gl;
		elitefour = ef;
	}
	
	public Gymleader getGymleaderrol() {
		return gymleaderrol;
	}

	public void setGymleaderrol(Gymleader gymleaderrol) {
		this.gymleaderrol = gymleaderrol;
	}

	public Elitefour getElitefourrol() {
		return elitefourrol;
	}

	public void setElitefourrol(Elitefour elitefourrol) {
		this.elitefourrol = elitefourrol;
	}

	public int getBadges() {
		return badges;
	}
	public void setBadges(int bg) {
		this.badges = bg;
	}
	public Pokemons getPokemons(Pokemons p) {
		bezitpokemons.add(p.toString());
		return pokemons;
	}
	public void setPokemons(Pokemons pokemons) {
		this.pokemons = pokemons;
	}
	
	public String toString() {
		String trainer = " is een ";
		if (elitefour == true) {
			 trainer = trainer + getElitefourrol();
		}
		else if (gymleader == true) {
			trainer = trainer + getGymleaderrol();
		}
		else {
			trainer = trainer + " trainer en heeft " + getBadges() + " badges";
		}
		trainer = trainer + " met de volgende pokemons \n";
			if (bezitpokemons.size() != 0) {
			for (int p = 0; p < bezitpokemons.size(); p++) {
					trainer = trainer + bezitpokemons.get(p);
				}
			}
		return trainer;
	}
	
}
