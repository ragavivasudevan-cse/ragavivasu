package program;
import java.util.Scanner;
public class ExceptOne {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int flag=0;
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]!=a[j]){
				flag++;
			}
		}
	
	if(flag==n-1){
		System.out.println(a[i]);
	
	}}
	s.close();
}
}
