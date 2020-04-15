

import java.util.Arrays;
import java.util.List;

public class Docentenenstudenten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Naam;
		double leeftijd;
		List<Integer> cijfers = Arrays.asList(10, 8, 4, 2, 7);
		String huisdier;
		String klasnaam;
		List<String> studentenlijst = Arrays.asList("henk", "rick", "david", "adriaan", "hans");
		String Docenten;
		
		double sum;
		sum = 0;
		double gem;
		
		for (int cijfer=0; cijfer<cijfers.size(); cijfer++) {
			sum += cijfers.get(cijfer);
		
		}
		gem = sum / cijfers.size();
		
		System.out.println(gem);	
	}

}
