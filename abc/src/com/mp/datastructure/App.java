package com.mp.datastructure;

import com.mp.datastructure.linkedlist.LinkedList;
import com.mp.datastructure.stack.Stack;

public class App {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(12);
		list.insert(13);
		list.insert(12);
		list.insert(3);
		list.insert(5);
		System.out.println("list=");
		list.show();
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		stack.push(10);
		stack.push(11);
		stack.push(16);
		stack.push(14);
		stack.push(12);
		System.out.println("stack=");
		stack.show();
		stack.pop();
		System.out.println("stack after pop=");
		stack.show();

	}

}
