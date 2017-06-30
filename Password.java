package guvi;
import java.util.Scanner;
public class Password {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	int n;
	String str="";
	String num="123456789"; 
	if(s1.length()==s2.length()){
		str+=s1+s2;
		System.out.println(str);
	}

else{
	if(s1.length()>s2.length()){
		n=s1.length()-s2.length();
		str=s2.concat(num.substring(0,n));
		for(int i=0;i<str.length();i++){
			System.out.print(s1.charAt(i));
			System.out.print(str.charAt(i));
		}
	}
	else{
		n=s2.length()-s1.length();
		str=s1.concat(num.substring(0,n));
		
		for(int i=0;i<str.length();i++){
			System.out.print(str.charAt(i));
			System.out.print(s2.charAt(i));
		}
	}
	
	

		
	
	
}
s.close();
}
}
