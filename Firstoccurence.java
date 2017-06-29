package guvi;
import java.util.Scanner;
public class Firstoccurence {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	String[] str=new String[n];
	for(int i=0;i<n;i++){
		str[i]=s.next();
		if(str[i].length()==1){
			System.out.println(str[i]);
		}
	}
	s.close();
	
}
}
