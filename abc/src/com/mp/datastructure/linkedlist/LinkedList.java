package com.mp.datastructure.linkedlist;

public class LinkedList {
	private Node head;
	class Node{
		Node node;
		int data;
		public Node() {
		}
		public Node(int data){
			this.node=null;
			this.data=data;
		}


	}



	public void  insert(int data){
		insert(head,data);

	}



	private void insert(Node head2, int data) {
		//System.out.println("hello");
		Node node=new Node(data);
		if(head==null){
			head=node;
			return;
		}
		Node node1=head;
		while(node1.node!=null){

			node1=node1.node;
		}
		node1.node=node;
		// TODO Auto-generated method stub

	}
	

	public void show(){
		Node n = head;
		//System.out.println("hello"+head);
		while (n != null)
		{
			System.out.println(n.data+" ");
			n = n.node;
		}
	}
}