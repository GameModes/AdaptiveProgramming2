package domeindesign1;

import java.util.ArrayList;

public class NPC {
	private String naam;
	ArrayList<String> bezititems = new ArrayList<String>();
	private Items items;
	private Trainer trainer;
	private Vendor vendor;
	private Route route;
	
	public NPC(String nm) {
		naam = nm;

	}
	
	
	public Vendor getVendor() {
		return vendor;
	}


	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}


	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	
	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Items getItems(Items i) {
		bezititems.add(i.toString());
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	
	public String toString() {
		String inwoner = naam;
		if (trainer != null){
			inwoner = inwoner + getTrainer().toString();
		}
		else {
			inwoner = inwoner + getVendor().toString();
		}
		inwoner = inwoner + "\nHeeft de volgende items: \n";
		if (bezititems.size() != 0) {
			for (int i = 0; i < bezititems.size(); i++) {
				inwoner = inwoner + bezititems.get(i);
			}
		}
		else {
			inwoner = inwoner + "\t Geen items \n";
		
		}
		if (route != null) {
			inwoner = inwoner + "\nEn staat op " + getRoute() + "\n";
		}
		else {
			inwoner = inwoner + "\nEn staat op geen route";
		}
		return inwoner;
		
	}
	
}
