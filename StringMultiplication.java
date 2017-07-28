package program;
import java.util.Scanner;
public class StringMultiplication {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int num=n1*n2;
		String mul=String.valueOf(num);
		System.out.println(mul);
		s.close();
	}
}
