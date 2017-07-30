package program;
import java.util.Scanner;
public class StockPrice {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int  min=9999;
	int max=-1;
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
		if(a[i]<min){
			min=a[i];
		}
		if(a[i]>max){
			max=a[i];
		}
	}
	int num=max-min;
	
	System.out.println(num);
	s.close();
}
}
