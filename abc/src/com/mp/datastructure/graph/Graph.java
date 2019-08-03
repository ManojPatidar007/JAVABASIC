import java.util.*;
class Graph{
	int v;
	LinkedList<Integer> list[];
	public Graph(int v){
		this.v=v;
		list=new LinkedList[v];
		for(int i=0;i<v;i++){
			list[i]=new LinkedList<Integer>();
		}
	}
	public void addAdge(int src,int dest){
		this.list[src].add(dest);
		this.list[dest].add(src);
	}
	public void printGraph(){
		
		for(int i=0;i<v;i++){
			System.out.println(i+"=>"+list[i]);
		}
	}
	public void BFS(int d){
			boolean visited[]=new boolean[v];
			LinkedList<Integer> queue=new LinkedList();
			visited[d]=true;
			queue.add(d);
			while(queue.size()!=0){
				int s=queue.poll();
				
				
			}
	}
	
}