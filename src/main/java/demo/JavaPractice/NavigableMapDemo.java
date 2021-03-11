package demo.JavaPractice;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableMapDemo {
	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put("a", "Kranthi");
		tm.put("z", "Kalyan");
		tm.put("w", "Kalyan");
		tm.put("r", "Kalyan");
		tm.put("t", "Kalyan");
		tm.put("y", "Kalyan");
		tm.put("h", "Kalyan");
		tm.put("j", "Kalyan");
		tm.put("l", "Kalyan");
		
		NavigableSet ns = tm.descendingKeySet();
		System.out.println(ns.toString());
		Collection c = tm.values();
		Iterator itr = c.iterator();
		while(itr.hasNext())
		{
			if(itr.next().toString().equals("Kalyan"))
			{
				itr.remove();
			}
			else
			{
				System.out.println(itr.next().toString());
			}
			
		}
		
	}
}
