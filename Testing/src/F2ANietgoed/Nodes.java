package F2ANietgoed;

import java.util.ArrayList;

public class Nodes {
	private static String woord;
	int ID = 0;
	ArrayList<Integer> path = new ArrayList<Integer>();
	
	
	public Nodes(String wd) {
		woord = wd;
		
	}
		
	public ArrayList<Integer> getPath(){	
		for (int index = 0; index < woord.length(); index++){
				if (ID == 0) {
					if (woord.charAt(index) == 'A') {
						path.add(ID);
						ID = 2;
					}
					else if (woord.charAt(index) == 'B') {
						path.add(ID);
						ID = 1;
					}
				}
				else if (ID == 1) {
					if (woord.charAt(index) == 'A') {
						path.add(ID);
						ID = 1;
					}
						
					else if (woord.charAt(index) == 'B') {
						path.add(ID);
						ID = 2;
					}
						
				}
				else if (ID == 2) {
					if (woord.charAt(index) == 'B') {
						path.add(ID);
						ID = 3;
					}
						
				}
				else if (ID == 3) {
					if (woord.charAt(index) == 'A') {
						path.add(ID);
						ID = 3;
					}
						
					else if (woord.charAt(index) == 'B') {
						path.add(ID);
						ID = 0;
					}
						
				}
				
			}
		path.add(ID); //om de laatste path toe te voegen
		return path;
		
		

}
}
