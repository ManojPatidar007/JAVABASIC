package com.mp;

import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils;
public class Bytes {

	public static void main(String[] args) {
		byte b=(byte) (126);
		short s=(short) (65531);
		int j=b;
		System.out.println(b);
		System.out.println(s);
		System.out.println(j);
		int a=10;  
		//nt b=10;  
		System.out.println(a++ + "hhh"+ ++a);//10+12=22  
		int i;
	    byte y;
	    i = 1024;
	  /*  for(i = 1024; i > 0; i-- ){

	      y = (byte)i;
	      System.out.print(i + " mod 128 = " + i%128 + " also ");
	      System.out.println(i + " cast to byte " + " = " + y);

	    }*/
	    Bytes b1=new Bytes();
	   // b1.binaryConvert(10);
	    b1.decimalConvert(1010000);

		// TODO Auto-generated method stub

	}
	public void binaryConvert(int num){
		int binary[]=new int[32];
		int ind=0;
		while(num>0){
			binary[ind++]=num%2;
			num/=2;
			
		}
		System.out.println(Arrays.toString(binary));
		//ArrayUtils.reverse(binary);
		
		for(int i = ind-1;i >= 0;i--){
		       System.out.print(binary[i]);
		     }
		//System.out.println(binary);
	}
	public void decimalConvert(int data){
		int i=0;
		int num = 0;
		while(true){
			if(data==0){break;}
			else{
				int temp=data%10;
				num=(int) (num+temp*Math.pow(2, i++));
				data=data/10;
				
				
			}
		}
System.out.println(num);
	}

}
