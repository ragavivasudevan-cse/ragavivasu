package program;
import java.util.Scanner;
public class Chocolate {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	int c=0;
	for(int i=0;i<n;i++){
		int a=s.nextInt();
		int b=s.nextInt();
		c=(a*b)-1;
		
		
		System.out.println(c);
	}
	
	s.close();
}
}
