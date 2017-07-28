package program;
import java.util.Scanner;
public class AbsoluteSum {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	int min=9999;
	int n1=0,n2=0;
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		sum=a[i]+a[j];
		sum=Math.abs(sum);
		if(sum<min){
			min=sum;
	        n1=a[i];
		    n2=a[j];
		}
	}
}
	System.out.println(n1 + " " + n2);
	s.close();
}
}
