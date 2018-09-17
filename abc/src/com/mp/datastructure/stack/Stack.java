package com.mp.datastructure.stack;

public class Stack {

	Node head;
	class Node{
		Node next;
		int data;
		public Node(){}
		public Node(int data){
			this.next=null;
			this.data=data;

		}
	}

	public void push(int data){
		insert(head,data);
	}

	private void insert(Node head1, int data) {

		Node node=new Node(data);
		if(head==null){
			head=node;
			return;
		}
		node.next=head;
		head=node;	
	}
	public void show(){
		Node node=head;
		//Boolean next=true;
		while(true){
			System.out.println(node.data);
			if(node.next==null){
				break;
			}
			node=node.next;
		}

	}
	public void pop(){
		head=head.next;
	}
}
