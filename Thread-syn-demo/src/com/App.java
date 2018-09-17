package com;

public class App {

	static Processer processer=new Processer();
	public static void main
	(String ar[]){

		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					processer.process();
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
					processer.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
				// TODO Auto-generated method stub

			}
		});

		t1.start();
		t2.start();
		
		
	}

}
