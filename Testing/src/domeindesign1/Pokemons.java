package domeindesign1;

public class Pokemons {
	private String pokemonnaam;
	private String type;
	
	public Pokemons(String pn, String tp) {
		pokemonnaam = pn;
		type = tp;
		
	}
	
	public String getPokemonnaam() {
		return pokemonnaam;
	}

	public void setPokemonnaam(String pn) {
		this.pokemonnaam = pn;
	}

	public String getType() {
		return type;
	}

	public void setType(String tp) {
		this.type = tp;
	}

	public String toString() {
		String pokemon =  "\t "+ pokemonnaam + " (" + type + " type)\n" ;
		return pokemon;
	}
}

	
	
	
	
	
	
	

