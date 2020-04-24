package domeindesign1;

public class Gymleader implements AchievementNPC{
	private String type;
	private String badge;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Gymleader(String tp, String bd) {
		type = tp;
		badge = bd;
	}
	
	public String getBadge() {
		return badge;
	}

	public void setBadge(String badge) {
		this.badge = badge;
	}
	
	public String toString() {
		String rol = "Gymleader (" + getType()+ " type) en geeft de " + getBadge();
		return rol;
	}

	@Override
	public void setAchievement() {
		System.out.println("Wel Achievement\n");
		
	}
}
