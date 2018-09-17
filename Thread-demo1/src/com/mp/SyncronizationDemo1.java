package com.mp;

public class SyncronizationDemo1 {
	private int count;
	private synchronized void pub() {
		// TODO Auto-generated method stub
count++;
	}
	public static void main(String ar[]){

		SyncronizationDemo1 app=new SyncronizationDemo1();
		app.show();
	}

	public void show(){
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("thread1");
					pub();
				}
				// TODO Auto-generated method stub

			}
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++){
					System.out.println("thread2");
					pub();
				}
				// TODO Auto-generated method stub

			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("count="+count);
		
	}
}

