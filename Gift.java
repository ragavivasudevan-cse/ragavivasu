package guvi;
import java.util.Scanner;
public class Gift {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int[] arr=new int[5];
	for(int i=0;i<5;i++){
	arr[i]=s.nextInt();
	}
	int max=-1;
	int min=9999;
	int sum=0;
	int sum1=0;
	for(int i=0;i<4;i++){
		if(arr[i]>max){
			max=arr[i];
		}
		if(arr[i]<min){
			min=arr[i];
		}
	}
	for(int i=0;i<4;i++){
		if(arr[i]!=max){
			
		sum+=arr[i];
	}
		
		if(arr[i]!=min){
			sum1+=arr[i];
			
		}
		
	}
	System.out.println("minimum budget"+sum);
	System.out.println("maximum budget"+sum1);
	s.close();
}
}
