package com.mp.datastructure.queue;

public class Queue {
	
	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		public Node(){}
		public Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public void insert(int data)
	{
		Node node=new Node(data);
		if (front==null){
			front=node;
			return;
		}
		
		
		
		
		
	}
}
