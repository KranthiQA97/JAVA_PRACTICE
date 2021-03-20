package demo.JavaPractice.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(1000);
		ts.add(2000);
		ts.add(3000);
		ts.add(4000);
		ts.add(5000);
		ts.add(6000);
		ts.add(7000);
		ts.add(8000);
		ts.add(9000);
		ts.add(10000);

		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(6000).toString());
		System.out.println(ts.subSet(4000, 8000).toString());
		System.out.println(ts.floor(5000));
		System.out.println(ts.ceiling(5000));
		System.out.println(ts.lower(6000));
		System.out.println(ts.higher(7000));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.descendingSet().toString());
		
		

	}

}
