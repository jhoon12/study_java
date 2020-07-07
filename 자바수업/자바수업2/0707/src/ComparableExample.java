
import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
//		TreeSet<Person> treeSet = new TreeSet<>();
//		treeSet.add(new Person("ȫ�浿", 45));
//		treeSet.add(new Person("���ڹ�", 25));
//		treeSet.add(new Person("������", 31));
//
//		Iterator<Person> iterator = treeSet.iterator();
//		while(iterator.hasNext()) {
//			Person person = iterator.next();
//			System.out.println(person.name+":"+person.age);
//		}
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingCompartor());
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name+":"+fruit.price);
		}
	}

}
