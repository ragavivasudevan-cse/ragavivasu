package program;
import java.util.Scanner;
public class Prefix {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();

	String[] str=new String[n];
	int count=0;
	for(int i=0;i<n;i++){
		str[i]=s.next();
		String ss=str[i];
		if(ss.length()>2){
		if((ss.charAt(0)=='0'&&ss.charAt(1)=='1')||(ss.charAt(0)=='1'&&ss.charAt(1)=='0')){
			count++;
		}
		}
		}
	
	System.out.println(count);
	s.close();
}
}
