package program;
import java.util.Scanner;
public class Marks {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String ss=s.next();
	String ss1=s.next();
	int n1=0;
	int n2=0;
	int n3=0;
	int n11=0;
	int n22=0;
	int n33=0;
    for(int i=0;i<ss.length();i++){
		if(ss.charAt(i)=='#'){
			 n1=i;
			
			 break;
		}}
		 for(int i=0;i<ss.length();i++){
		if(ss1.charAt(i)=='#'){
			 n11=i;
			
			 break;
		}
	}
	for(int i=n1+1;i<ss.length();i++){
		if(ss.charAt(i)=='#'){
			 n2=i;
			
			 break;
		}
	}
	 for(int i=n11+1;i<ss.length();i++){
		if(ss1.charAt(i)=='#'){
			 n22=i;
			
			 break;
		}
	}
	for(int i=n2+1;i<ss.length();i++){
		if(ss.charAt(i)=='#'){
			  n3=i;
			  
			  break;
		}
	}
	 for(int i=n22+1;i<ss.length();i++){
		if(ss1.charAt(i)=='#'){
			 n33=i;
			 
			 break;
		}
	}
	int num1=Integer.parseInt(ss.substring(n1+1,n2));
	int num2=Integer.parseInt(ss.substring(n2+1,n3));
	int num3=Integer.parseInt(ss.substring(n3+1,ss.length()));
	int sum1=num1+num2+num3;
	int num11=Integer.parseInt(ss1.substring(n11+1,n22));
	int num22=Integer.parseInt(ss1.substring(n22+1,n33));
	int num33=Integer.parseInt(ss1.substring(n33+1,ss1.length()));
	int sum11=num11+num22+num33;
	if(sum1<sum11){
		System.out.println(ss1.substring(0,n11));
	}
	else{
		System.out.println(ss.substring(0,n1));
	}
}
}
