package program;
import java.util.Scanner;
public class Palindrome {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0,rev=0;
	while(n!=0){
		int num=n%10;
		n=n/10;
		sum+=num;
	}
	System.out.println(sum);
	int sum1=sum;
	while(sum!=0){
		int rem=sum%10;
		rev=rev*10+rem;
		sum/=10;
		
	}
	System.out.println(rev);
	if(rev==sum1){
		System.out.println("it is palindrome");
	}
	else{
		System.out.println("it is not palindrome");
	}
	
}
}
