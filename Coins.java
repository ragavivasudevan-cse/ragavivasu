package program;
import java.util.Scanner;
public class Coins {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n%2==0){
		System.out.println(n/2);
	}else{
		System.out.println((n/2)+1);
	}
	s.close();
}
}

