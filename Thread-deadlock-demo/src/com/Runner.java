package com;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
	Account a1=new Account();
	Account a2=new Account();
	private Lock l1=new ReentrantLock();
	private Lock l2=new ReentrantLock();

	public void first() throws InterruptedException{
		System.out.println(	"t1");
		Random rm=new Random();
		for(int i=0;i<10000;i++){
			l1.lock();
			l2.lock();
			try{
			Account.transfar(a1,a2,rm.nextInt(100));}
			finally {
				l1.unlock();
				l2.unlock();
			}
		}
		
		
		// TODO Auto-generated method stub
		
	}

	public void second()throws InterruptedException {
		System.out.println(	"t2");
		Random rm=new Random();
		for(int i=0;i<10000;i++){
			l2.lock();
			l1.lock();
			
			try{
				Account.transfar(a2,a1,rm.nextInt(100));}
				finally {
					l1.unlock();
					l2.unlock();
				}
		}
		// TODO Auto-generated method stub
		
	}
	
	public void total(){
		System.out.println("a1 balance="+a1.getBalance());
		System.out.println("a2 balance="+a2.getBalance());

		System.out.println("total="+(a1.getBalance()+a2.getBalance()));
	}
	
	

}
