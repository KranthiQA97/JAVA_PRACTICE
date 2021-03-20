package demo.JavaPractice.collections;

import java.util.TreeSet;

public class TreeSetComparatorConstuctor {

	public static void main(String[] args) {

		
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(25);
		ts.add(26);
		ts.add(50);
		ts.add(95);
		ts.add(23);
		ts.add(42);
		
		System.out.println("Sorting Order "+ts);
		
		
		
		
	}

}
