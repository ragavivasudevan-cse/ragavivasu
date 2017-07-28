package program;
import java.util.Scanner;
public class SumPair {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int n=s.nextInt();
	int count=0;
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(Math.abs(a[i]-a[j])==k){
				count++;
			}
					
		}
	}
	System.out.println(count);
	s.close();
}
}
