package F1;

public class Autohuur {
	private Integer aantalDagen;
	private Auto auto;
	private Klant klant;
		
	public void setGehuurdeAuto(Auto gA) {
		auto = gA;
	}
		
	public void setHuurder(Klant k) {
		klant = k;
	}
		
	public void setAantalDagen(Integer aD) {
	    aantalDagen = aD;
	}
	
	public Auto getGehuurdeAuto() {
		return auto;
	}
	
	public Klant getHuurder() {
		return klant;
	}
	
	public double totaalPrijs() {
		double totaalprijs = aantalDagen*auto.prijsPerDag - aantalDagen*auto.prijsPerDag*(klant.kortingsPercentage/100);
		return totaalprijs;
	}

	
	public String toString() {
		String a = "";	
        if (getGehuurdeAuto() == null) {
        	a = "\t er is geen auto bekend \n";
        } else {
        	a = "\t autotype: " + getGehuurdeAuto().toString() + "\n";
        }

        if (getHuurder() == null) {
            a = a + "\t er is geen huurder bekend \n";
        } else {
            a = a + "\t " + getHuurder().toString() + "\n";
        }

        if (aantalDagen == null) {
            a = a + "\t aantal dagen: 0 en dat kost 0.0 \n";
        } else {
            a = a + "\t aantal dagen: " + this.aantalDagen + " en dat kost " + totaalPrijs() + "\n";
        }
        
		return a;

	}
}
