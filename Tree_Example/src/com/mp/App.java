package com.mp;

import com.mp.tree.TreeImpl;

public class App {
	
	public static void main(String[] args) {
	
TreeImpl t=new TreeImpl();
t.add(5);
t.add(25);
t.add(35);
t.add(15);
t.add(35);
t.add(55);
t.show();
System.out.println("size="+t.size());
	}

}
