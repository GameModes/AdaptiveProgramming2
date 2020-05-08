package F2ANietgoed;

import java.util.ArrayList;

public class test {
	private static String woord;
	int voidnummer = 0;
	ArrayList<Integer> path = new ArrayList<Integer>();
	
	
	public test(String wd) {
		woord = wd;
		
	}
	
	
//		String woord = new String("BAAB");
		
	public ArrayList<Integer> getPath(){	
		for (int index = 0; index < woord.length(); index++){
				if (voidnummer == 0) {
					if (woord.charAt(index) == 'A') {
						path.add(voidnummer);
						voidnummer = 2;
					}
					else if (woord.charAt(index) == 'B') {
						path.add(voidnummer);
						voidnummer = 1;
					}
				}
				else if (voidnummer == 1) {
					if (woord.charAt(index) == 'A') {
						path.add(voidnummer);
						voidnummer = 1;
					}
						
					else if (woord.charAt(index) == 'B') {
						path.add(voidnummer);
						voidnummer = 2;
					}
						
				}
				else if (voidnummer == 2) {
					if (woord.charAt(index) == 'B') {
						path.add(voidnummer);
						voidnummer = 3;
					}
						
				}
				else if (voidnummer == 3) {
					if (woord.charAt(index) == 'A') {
						path.add(voidnummer);
						voidnummer = 3;
					}
						
					else if (woord.charAt(index) == 'B') {
						path.add(voidnummer);
						voidnummer = 0;
					}
						
				}
				
			}
		path.add(voidnummer);
		return path;
		
		

}
}
