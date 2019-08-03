import java.util.*;
class IndirectFriend{
	public static void main(String ar[]){
		Friend f1=new Friend("aj");
		Friend f2=new Friend("bj");
		Friend f3=new Friend("cj");
		Friend f4=new Friend("dj");
		f1.addFriend(f2);
		f1.addFriend(f3);
		f3.addFriend(f4);
		List<Friend> fr=f1.getFriends();
	for(Friend f:fr){
		System.out.println(f);
	}
		
		
	}
	public boolean isFriend(Friend f){
		List<Friend> f1=this.getFriends();
		List<Friend> f2=f.getFriends();
		
		
	}
	
}