package program;
import java.util.Scanner;
public class Stiars {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=n;i++){
		System.out.print(i+" ");
	}
	System.out.println("");
	for(int i=2;i<=n;i+=2){
		System.out.print(i+" ");
	}
	s.close();
  }
}
