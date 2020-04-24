package domeindesign1;

public class Items {
	private String itemnaam;
	private String category;
	
	public Items(String in, String ct) {
		itemnaam = in;
		category = ct;
	}

	public String getItemnaam() {
		return itemnaam;
	}

	public void setItemnaam(String itemnaam) {
		this.itemnaam = itemnaam;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String toString() {
		String Item =  "\t "+ itemnaam + " uit de category " + category + "\n";
		return Item;
	}



}
