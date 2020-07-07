
import java.util.*;

public class TreeSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c~f사이의 단어 검색]");
		
		NavigableSet<String> rangeSet = treeSet.subSet("c", false, "f", false);
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}

}
