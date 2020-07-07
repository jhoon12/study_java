
import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
//		TreeSet<Person> treeSet = new TreeSet<>();
//		treeSet.add(new Person("홍길동", 45));
//		treeSet.add(new Person("김자바", 25));
//		treeSet.add(new Person("박지원", 31));
//
//		Iterator<Person> iterator = treeSet.iterator();
//		while(iterator.hasNext()) {
//			Person person = iterator.next();
//			System.out.println(person.name+":"+person.age);
//		}
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingCompartor());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name+":"+fruit.price);
		}
	}

}
