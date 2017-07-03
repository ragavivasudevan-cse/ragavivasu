package guvi;
import java.util.Scanner;
public class MathPower {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int pow=0;
	int b=a;;
	String str=String.valueOf(b);
	int n=str.length();
	int num=n-1;
	while(a>0){
		int rem=a%10;
		pow+=Math.pow(rem, num);
		a/=10;
		num--;
	}
	System.out.println(pow);
	s.close();
}
}
