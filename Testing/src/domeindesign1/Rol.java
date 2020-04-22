package domeindesign1;

public class Rol {
	private boolean gymleader;
	private boolean trainer;
	
	public Rol(boolean gl, boolean tn) {
		gymleader = gl;
		trainer = tn;
		
	}

	public boolean isGymleader() {
		return gymleader;
	}

	public void setGymleader(boolean gymleader) {
		this.gymleader = gymleader;
	}

	public boolean isTrainer() {
		return trainer;
	}

	public void setTrainer(boolean trainer) {
		this.trainer = trainer;
	}
	
	public String toString() {
		String rol = "";
		if (gymleader == true){
			rol =  "is een gymleader";
		}
		else if (trainer == true){
			rol =  "is een trainer";
		}
		else{
			rol =  "is een npc";	
		}
		return rol;
	}
}
