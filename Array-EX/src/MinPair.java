import java.util.Scanner;

public class MinPair {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	   // int test=sc.nextInt();
	   /// while(test>0){
	        int n=sc.nextInt();
	        int arr[]=new int[2*n];
	        for(int i=0;i<n*2;i++){
	            arr[i]=sc.nextInt();
	        }
	        
	        for(int i=0;i<n*2-1;i++){
	            for(int j=i+1;j<n*2;j++){
	                if(arr[i]>arr[j]){
	                    arr[i]=arr[i]+arr[j];
	                    arr[j]=arr[i]-arr[j];
	                    arr[i]=arr[i]-arr[j];
	                }
	            }
	            
	        }
	        int j=n*2;
	        for(int i=0;i<n*2;i++){
	       // System.out.print("("+arr[i]+","+arr[--j]+")");
	        	System.out.print(arr[i]);
	        }
	        
	     //   test--;
	  //  }
		//code
	}
}