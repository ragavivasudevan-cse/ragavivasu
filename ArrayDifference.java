package program;
import java.util.Scanner;
public class ArrayDifference {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int max=-1;
	int n=s.nextInt();
	int n1=0;
	int n2=0;
	int index=0;
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n-1;i++){
		int sum=Math.abs(a[i]-a[i+1]);
		
		if(sum>max){
			max=sum;
			n1=a[i];
		    n2=a[i+1];
		    if(n1>n2){
		        index=i;
		    }
		 	else{
		 		index=i+1;
		 		
		 	}
		}
	
	
	}
	System.out.println(index);
	s.close();
}
}
