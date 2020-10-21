package org.setnew;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CharSet {

	public static void main(String[] args) {
		Set<Character> n = new TreeSet<Character>();
		
		n.add('d');
		n.add('A');
		n.add('$');
		n.add('!');
		n.add('1');
		
		System.out.println(n);
	}
}
