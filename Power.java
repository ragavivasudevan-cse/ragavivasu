package program;
import java.util.Scanner;
public class Power {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int num=n%10;
	int tot=0;
	int pow=1;
	String str=String.valueOf(n);
	for(int i=0;i<str.length();i++){
		int n1=Integer.parseInt(String.valueOf(str.charAt(i)));
		num=n%10;
		pow=1;
		while(num!=0){
			pow*=n1;
			num--;
		}
	tot+=pow;
	}
	System.out.println(tot);

	s.close();
}
}
