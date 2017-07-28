package program;
import java.util.Scanner;
public class Rotate {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int n=s.nextInt();
	int[] a=new int[n];
	int[] b=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	int j=0;
	for(int i=k;i<n;i++){
		b[j]=a[i];
		j++;
	}
	for(int i=0;i<k;i++){
		b[j]=a[i];
		j++;
	}
	for(int i=0;i<n;i++){
		System.out.println(b[i]);
	}
	s.close();
}
}
