package com;

 class Account {
	private int bacance=10000;
	public int getBalance(){
		return bacance;
	}
	public void withdraw(int ammount){
		//if(bacance>=ammount)
		bacance-=ammount;
	}
	public void deposit(int ammount){
		bacance+=ammount;
	}
	public static void transfar(Account a1,Account a2,int amount){
		a1.withdraw(amount);
		a2.deposit(amount);
	}
	
}
