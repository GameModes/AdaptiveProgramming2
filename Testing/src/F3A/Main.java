package F3A;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	ArrayList<String> alphabet1 = new ArrayList<String>();
	ArrayList<ArrayList<Character>> chartest = new ArrayList<ArrayList<Character>>();
	alphabet1.add("xb");
	alphabet1.add("ce");
	alphabet1.add("bt");
	alphabet1.add("hi");
	AlphabetSorter sortedAlphabetList1 = new AlphabetSorter(alphabet1);
	
	chartest = sortedAlphabetList1.charListsMaker(alphabet1);
//	System.out.println(sortedAlphabetList1.charListsMaker(alphabet1));
	System.out.println(chartest);
	chartest = sortedAlphabetList1.bubbleSort(chartest);
	System.out.println(chartest);
	
	alphabet1 = sortedAlphabetList1.compareTomethod(alphabet1);
	System.out.println(alphabet1);
	
	
	}
	
}
