import java.util.*;
class Friend{
	String name;
	List<Friend> list=new LinkedList();
		public void addFriend(Friend f){
			this.list.add(f);
			f.list.add(this);
		}
		public List<Friend> getFriends(){
			return this.list;
		}
		public Friend(String name){
			this.name=name;
		}
		public Friend(){
			System.out.println("inside non");
		}
		public String toString(){
			return " "+this.name;
		}
}