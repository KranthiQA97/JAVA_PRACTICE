package demo.JavaPractice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceProgram {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("10");
		l.add("50");
		l.add("80");
		l.add("30");
		
		
		ListIterator litr =  l.listIterator();
		
		while(litr.hasNext())
		{
			if(litr.next()!=null)
			{
				System.out.println(litr.next());
			}
		}
	}

}
