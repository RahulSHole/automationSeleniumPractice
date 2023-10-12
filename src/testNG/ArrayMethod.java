package testNG;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayMethod {

	public static void main(String[] args) {

		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Rahul");
		
		a.add("Gaurav");
		
//		a.add("Manoj");
		
		Iterator<String> it=a.iterator();
		
		System.out.println(it.next());
		
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		
		
	}

}
