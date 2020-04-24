package domeindesign1;

public class Elitefour implements AchievementNPC {
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Elitefour(String ef) {
		type = ef;
	}
	
	public void setAchievement() {
		System.out.println("Geen Achievement");
	}
	
	public String toString() {
		String rol = "Elitefour (" + getType()+ " type) en geeft de toegang tot de volgende elite/champion met de achievement: ";
		return rol;
	}
}


