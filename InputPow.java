package program;
import java.util.Scanner;
public class InputPow {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int num=n%10;
	int tot=0;
	int pow=0;
	String str=String.valueOf(n);
	for(int i=0;i<str.length();i++){
		int n1=Integer.parseInt(String.valueOf(str.charAt(i)));
		pow=(int)Math.pow(n1, num);
		tot+=pow;
	}
	System.out.println(tot);
	s.close();
}
}
