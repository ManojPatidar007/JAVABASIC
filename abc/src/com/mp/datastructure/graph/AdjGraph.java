class AdjGraph{
		public static void main(String ar[]){
			Graph g=new Graph(5);
			g.addAdge(1,2);
			g.addAdge(2,3);
			g.addAdge(3,4);
			g.addAdge(4,1);
			g.addAdge(2,4);
			g.printGraph();
			g.BFS(3);
			
		}
	}