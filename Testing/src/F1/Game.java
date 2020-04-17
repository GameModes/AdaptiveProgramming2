package F1;

import java.time.LocalDate;


public class Game {
	private String gameTitel;
	private double waarde;
	private int releaseJaar;
	
	public Game(String gT, double wd, int rJ) {
		gameTitel = gT;
		waarde = wd;
		releaseJaar = rJ;	
	}
	
	public double getWaarde() {
		return waarde;
	}
	
	public double newWaarde(double waarde) {
		double nieuwwaarde = waarde*(Math.pow(0.7, (LocalDate.now().getYear()-releaseJaar)));
		return nieuwwaarde;
		
	}
	public void setWaarde(double wd) {
		waarde = wd;
	}
	
	public String getGameTitel() {
		return gameTitel;
	}

	public void setGameTitel(String gameTitel) {
		this.gameTitel = gameTitel;
	}

	public int getReleaseJaar() {
		return releaseJaar;
	}

	public void setReleaseJaar(int releaseJaar) {
		this.releaseJaar = releaseJaar;
	}

	public double getreleaseJaar() {
		return releaseJaar;
	}
	
	public void setreleaseJaar(int rJ) {
		releaseJaar = rJ;
	}
	
	public String toString() {
		String k = gameTitel + ", uitgegeven in " + releaseJaar +" , nieuwprijs: $" + waarde + " nu voor: $" + newWaarde(waarde) ;
		return k;
	}
}
