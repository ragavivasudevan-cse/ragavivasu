package program;
import java.util.Scanner;
public class InputMul {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	int tot=0;
	String sc=String.valueOf(n);
	for(int i=0;i<sc.length();i++){
		int num=Integer.parseInt(String.valueOf(sc.charAt(i)));
		sum+=num;
		tot+=sum;
	}
	System.out.println(tot);
	s.close();
	
	
}
}
