package com;

public class App {
	static Runner runner=new Runner();
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					runner.first();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// TODO Auto-generated method stub

			}
		});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					runner.second();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				// TODO Auto-generated method stub

			}
		});
		//System.out.println(	t2.getName());

		//t1.setPriority(Thread.MIN_PRIORITY);
		//t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t1.join();
		t2.join();
		// TODO Auto-generated method stub

		runner.total();
	}

}
