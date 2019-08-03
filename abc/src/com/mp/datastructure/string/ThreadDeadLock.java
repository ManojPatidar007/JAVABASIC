import java.util.*;
class ThreadDeadLock{
	public static String i="hello";
	public static String j="sir";
	public static void show1(){
		synchronized(i){
			try{
				System.out.println("inside 1");
				Thread.sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("waiting 2");
			synchronized(j){
			System.out.println("will wait");}
		}
	}
	public static void show2(){
		synchronized(j){
			try{
				System.out.println("inside 2");
				Thread.sleep(1000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("waiting 1");
			synchronized(i){
			System.out.println("will wait");}
		}
	}
	
	public static void main(String ar[]){
		Thread t1=new Thread(){
			public void run(){
				show1();
			}
		
		};
		Thread t2=new Thread(){
			public void run(){
				show2();
			}
		};
		t1.start();
		t2.start();
	}
	
}