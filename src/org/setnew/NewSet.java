package org.setnew;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NewSet {
	
	public static void main(String[] args) {
		Set<Integer> d = new TreeSet<Integer>();

		d.add(60);
		d.add(88);
		d.add(65);
		d.add(90);
		d.add(60);
		d.add(88);
		
		//to find the size
		
		int h = d.size();
		System.out.println(d);
		
		// to remove the value
		d.remove(65);
		System.out.println(d);
		
		
		
		
		
	}

}
