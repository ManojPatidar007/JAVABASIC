package com.mp;

public class Sortarrayabsolutediff {

	public static void main(String ar[]){
		int arr[]={10,-4,13,-7,29,23};
		int diff=5;
		shorts(arr,arr.length);
	}
	public static void shorts(int []arr,int n){

		int temps[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++){
			if(arr[i]>=0)
				temps[j++]=arr[i];
		}
		for(int i=0;i<n;i++){
			if(arr[i]<0){
				temps[j++]=arr[i];
			}

		}
		for(int k=0;k<n;k++){
			System.out.print(temps[k]);
			if(!(k==n-1)){
				System.out.print(",");
			}
		}
	}
}