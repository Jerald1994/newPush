package org.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSet {
	public static void main(String[] args) {
		
		List<Object> g = new ArrayList<Object>();
        g.add("ghffgfgfgfg");
		g.add(60);
		g.add(88);
		g.add(65);
		g.add(90);
		g.add(60);
		g.add(88);
		
		System.out.println(g);
		System.out.println("--------------");
		
		
		
	//for method	
		for (int i = 0; i < g.size(); i++) {
			System.out.println(g.get(i));
			
			//for each method 
		System.out.println("----------------");	
			
			}
		for (Object jet : g) {
			System.out.println(jet);
			
			System.out.println("-------------");
			
		}
		
		Set<Object> b = new LinkedHashSet<Object>();
		b.addAll(g);
System.out.println(b);
		
	}
	
	



}
