package program;
import java.util.Scanner;
public class TargetSum {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int set=0;
	int[] a=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	int sum=0;
	int flag=0;
	int m=s.nextInt();
	int mm=m;
	int t=s.nextInt();
	for(int i=0;i<n;i++){
	
		sum+=a[i];
		for(int j=0;j<n;j++){
			m=mm;
			sum=0;
		while(m!=1){
			sum+=a[j];
			m--;
		}
	
		if(sum==t){
			set++;
		}
		
	
		else{
			flag++;
		}
		}
		}
	if(set!=0){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
	
	
	
}
}
