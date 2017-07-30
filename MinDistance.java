package program;
import java.util.Scanner;
public class MinDistance {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int min=99;
	int count=0;
	int n=s.nextInt();
	int[] a=new int[n];
	int n1=s.nextInt();
	int n2=s.nextInt();
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if((a[i]==n1&&a[j]==n2)||(a[i]==n2&&a[j]==n1)){
				
				count=Math.abs(i-j);
				
				if(count<min){
					min=count;
					
				}
			}
		}
	}
	System.out.println(min);
	s.close();
}
}
