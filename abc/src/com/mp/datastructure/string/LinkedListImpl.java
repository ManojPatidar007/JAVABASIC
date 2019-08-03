class LinkedListImpl{
Node root;
	public void add(int data){
		if(root==null){
			root=new Node(data);
		return;	
		}
		Node temp=root;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=new Node(data);

	}
	public void printList(){
		Node temp=root;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void reverse(){
		Node pre=null;
		Node next=null;
		root=reverse(root,pre,next);
	}
	public Node reverse(Node temp,Node pre, Node next){
		
		if(temp==null){
			return pre;
		}
		next=temp.next;
		temp.next=pre;
		pre=temp;	
		temp=next;
		 return reverse(temp,pre,next);
		
		
		
	}

}