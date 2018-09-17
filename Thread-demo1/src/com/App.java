package com;



class Runner extends Thread{

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("yooo");
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
public class App {
	public static void main(String ar[]){
		Runner runner=new Runner();
		runner.start();
		
		Runner runner2=new Runner();
		//runner2.start();
		
	}

}
