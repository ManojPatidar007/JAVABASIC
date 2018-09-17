package com;
class Runners implements Runnable{

	

	public Runners() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("i="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
public class App2 {
	public static void main(String ar[]){
		Thread thread=new Thread(new Runners());
		thread.run();
		//thread.start();
		Thread thread2=new Thread(new Abc());
		thread2.start();
		
	}

}
