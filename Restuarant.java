package program;
import java.util.Scanner;
public class Restuarant {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int sum=0;
	System.out.println("enter the no of items");
	int n=s.nextInt();
	System.out.println("enter the k item");
	int k=s.nextInt();
	int[] arr=new int[n];
	System.out.println("enter the cost of items");
	for(int i=0;i<n;i++){
		arr[i]=s.nextInt();
		if(i!=(k-1)){
		sum+=arr[i];
	}
		}
	System.out.println("charged cost");
	int out=s.nextInt();
	
	if(sum/(n-1)==out){
		System.out.println("bon appetit");
	}
	else{
		System.out.println(out-(sum/(n-1)));
	}
s.close();	
}
}
