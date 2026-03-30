package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List <Integer> lt=new LinkedList<Integer>();
		lt.add(45);
		lt.add(24);
		lt.add(58);
		lt.add(69);
		lt.add(79);
		
	//	System.out.println(lt);
		
		Iterator<Integer> iter=lt.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		iter.remove();
		
		System.out.println(lt);
		
		

	}

}
