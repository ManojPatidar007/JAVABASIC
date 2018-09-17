package com;

import java.util.*;

public class Processer {
	Object lock=new Object();
List<Integer> list=new LinkedList<>();
	private final int LIMIT=10;
	public void process() throws InterruptedException {
		Random rem=new Random();
		while(true){
			synchronized(lock){
				if(list.size()==LIMIT){
					lock.wait();
				}
				System.out.println("inside producer");
				list.add(rem.nextInt(30));
				lock.notify();
			}
		}

		// TODO Auto-generated method stub

	}

	public void consume() throws InterruptedException {
		Thread.sleep(1000);
		while(true){
			synchronized (lock) {
				if(list.isEmpty()){
					lock.wait();
				}

				System.out.println("inside consume length of list="+list.size());
				((LinkedList<Integer>) list).removeFirst();
				lock.notify();
			}
		}
		// TODO Auto-generated method stub

	}

}
