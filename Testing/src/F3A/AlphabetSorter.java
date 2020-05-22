package F3A;
import java.util.*;

public class AlphabetSorter {
	public ArrayList<String> compareTomethod (ArrayList<String> aL){ //methode1
	      for(int i = 0; i<aL.size()-1; i++) {
	          for (int j = i+1; j<aL.size(); j++) {
	             if(aL.get(i).compareTo(aL.get(j))>0) {
	                String temp = aL.get(i);
	                aL.set(i, aL.get(j));
	                aL.set(j, temp);
	             }
	          }
	       }
		return aL;
		
	}	
	
	
	
	
	public ArrayList<ArrayList<Character>> charListsMaker (ArrayList<String> aL){//methode 2, hakt strings in de list in character stukjes
		ArrayList<ArrayList<Character>> wordList = new ArrayList<ArrayList<Character>>();
		for(int index = 0; index<aL.size(); index++) {
			String word = aL.get(index);
			ArrayList<Character> charList = new ArrayList<Character>();
			for (int ci = 0; ci < word.length(); ci++){
			    charList.add(word.charAt(ci));
			}
			wordList.add(charList);

		}
		return wordList;
	}
	
	public ArrayList<ArrayList<Character>> bubbleSort (ArrayList<ArrayList<Character>> wordList) { //methode 2, vergelijkt en vervangt

	int lengte = wordList.size();
	while (lengte > 0) {	
		
		lengte = lengte - 1;
		for(int index = 0; index<wordList.size(); index++) {
			try { //tegen de out of bounds error
			ArrayList<Character> firstword = wordList.get(index);
			ArrayList<Character> secondword = wordList.get(index+1);
			if (firstword.get(0) > secondword.get(0)) {
				ArrayList<Character> temp = wordList.get(index);
				wordList.set(index, wordList.get(index+1));
				wordList.set(index+1, temp);  }
			else if (firstword.get(0) == secondword.get(0)) {
				if (firstword.get(1) > secondword.get(1)) {
					ArrayList<Character> temp = wordList.get(index);
					wordList.set(index, wordList.get(index+1));
					wordList.set(index+1, temp);  }
			}
			} catch(Exception e) {
				break;
			}
			
		}
	}
		return wordList;
		
	}

	public ArrayList<String> stringListsMaker (ArrayList<ArrayList<Character>> wordList){//methode 2, zet character stukjes in list als strings
		ArrayList<String> SortedaL = new ArrayList<String>();
		for(int i = 0; i<wordList.size(); i++) {
			String word = new String();
			for(int j = 0; j<wordList.get(i).size(); j++) {
				word = word + wordList.get(i).get(j);
			}
			SortedaL.add(word);
		}
		return SortedaL;
		
	}
	
	
}
