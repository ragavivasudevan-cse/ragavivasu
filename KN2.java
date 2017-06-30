package guvi;
import java.util.Scanner;
public class KN2 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int n=s.nextInt();
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			System.out.println("["+i+","+"j"+"]");
		}
	}
	s.close();
}
}
