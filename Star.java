package guvi;
import java.util.Scanner;
public class Star {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
			int n1=n;
			int n2=n;
for(int i=0;i<n;i++){
	for(int j=0;j<n1*2;j++){
		if(j==n2){
			System.out.print(" ");
		}
		System.out.print("*");
		
  }
	n1--;
	n2--;
	System.out.println("");
}
s.close();
}
}
