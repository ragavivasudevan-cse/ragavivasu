package program;
import java.util.Arrays;
import java.util.Scanner;
public class LeastNumber {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the k value");
	int n=s.nextInt();
	System.out.println("Enter the number");
	int num=s.nextInt();
	String str=String.valueOf(num);
	int[] a=new int[str.length()];
	int i=0;
	while(num!=0){
		int rem=num%10;
		a[i]=rem;
	
		i++;
		num/=10;
	}
	
	Arrays.sort(a);

	for(int j=0;j<a.length-n;j++){
		System.out.println(a[j]);
	}

	
	s.close();
	
}
}
