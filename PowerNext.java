package program;
import java.util.Scanner;
public class PowerNext {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int tot=0;
	int pow=1;
	int n2;
	String str=String.valueOf(num);
 for(int i=0;i<str.length();i++){
	 if(i==str.length()-1){
	       n2=Integer.parseInt(String.valueOf(str.charAt(0)));
	 }else{
		   n2=Integer.parseInt(String.valueOf(str.charAt(i+1)));
	 }
	 int n1=Integer.parseInt(String.valueOf(str.charAt(i)));
	
	 pow=1;
	 while(n2!=0){
		 pow*=n1;
		 n2--;
	 }
	 tot+=pow;
	 
 }
 System.out.println(tot);
	s.close();
	}
}
