package F3A;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	ArrayList<ArrayList<Character>> charList = new ArrayList<ArrayList<Character>>();
	AlphabetSorter sortedAlphabetList = new AlphabetSorter();

	ArrayList<String> alphabet1 = new ArrayList<String>();
	alphabet1.add("xe");
	alphabet1.add("xb");
	alphabet1.add("bt");
	alphabet1.add("hi");

	
	ArrayList<String> alphabet2 = new ArrayList<String>();
	alphabet2.add("ik");
	alphabet2.add("wil");
	alphabet2.add("een");
	alphabet2.add("koekje");
	
	charList = sortedAlphabetList.charListsMaker(alphabet2);
	charList = sortedAlphabetList.bubbleSort(charList);
	alphabet2 = sortedAlphabetList.stringListsMaker(charList);
	System.out.println(alphabet2);
	
	
	alphabet1 = sortedAlphabetList.compareTomethod(alphabet1);
	System.out.println(alphabet1);
	
	
	}
	
}
