package program;
import java.util.Scanner;
public class Replace {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int max=-1;
	int[] a=new int[n];
	int[] b=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n-2;i++){
		max=-1;
		for(int j=i+1;j<n;j++){
			if(a[j]>max){
				max=a[j];
			}
		 
		}
		 b[i]=max;
	}
	b[n-2]=a[n-1];
	b[n-1]=0;
	for(int i=0;i<n;i++){
		System.out.println(b[i]);
	}
	s.close();
}
}
