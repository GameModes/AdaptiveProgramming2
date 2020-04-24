package domeindesign1;

public class Vendor {
	private boolean praatbaar;

	public Vendor(boolean pb) {
		praatbaar = pb;
	}

	public boolean getPraatbaar() {
		return praatbaar;
	}

	public void setPraatbaar(boolean praatbaar) {
		this.praatbaar = praatbaar;
	}
	
	public String toString() {
		String rol = " is een Vendor en is";
		if (praatbaar = false){
			rol = rol + " niet ";
		}
		rol = rol + " praatbaar";
		return rol;
	}
}
