package program;
import java.util.Arrays;
import java.util.Scanner;
public class Elephant {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	
	int w=s.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			sum+=a[i];
			if(sum>=w){
				System.out.println(i);
				break;
			}
		}
		if(sum<w){
			System.out.println(n);
		}
	
	s.close();
}
}
