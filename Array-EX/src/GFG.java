import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test>0){
			int no=sc.nextInt();
			int arr[]=new int[no*2];

			for(int i=0;i<no;i++){
				arr[i]=sc.nextInt();
			}
			int sum1=sc.nextInt();

			if (no==4){

				int sum=0;
				for(int i=0;i<no;i++){
					sum=sum+arr[i];
				}
				if(sum==sum1){
					System.out.println(1); 
				}
				else{
					System.out.println(0);
				}
			}
			else{

				for(int i=0;i<no-4;i++){
					for(int j=i+1;j<no-3;j++){
						for(int k=j+1;k<no-2;k++){
							int sum=0;
							for(int l=k+1;l<no;l++){
								sum=arr[i]+arr[j]+arr[k]+arr[l];
								if (sum==sum1){
									System.out.println(1);
									return;
								}
							}
						}
					}

				}
				System.out.println(0);

			}
			test--;

		}	
		//code
	}
}