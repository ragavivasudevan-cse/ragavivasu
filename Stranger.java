package program;
import java.util.Scanner;
public class Stranger {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("time");
	int n=s.nextInt();
	
	int[] arr=new int[n];
	arr[0]=3;
	int num=arr[0];
	int temp=num;
	for(int i=1;i<n;i++){
		arr[i]=--num;
		if(arr[i]==1){
			temp=temp*2;
			num=temp+1;
		
			}
		}
	
	System.out.println("value:"+arr[n-1]);
	s.close();
    }
}
