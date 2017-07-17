package program;
import java.util.Scanner;
public class UserId {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str1=s.next();
	String str2=s.next();
	String s1;
	String s2;
	String id=" ";
	String rev="";
	String num=s.next();
	int n=s.nextInt();
	if(str1.length()<str2.length()){
		 s1=str1;
	     s2=str2;
	}
	
	else{
		 s1=str2;
       	s2=str1;


}if(str1.length()==str2.length()){
	if(str1.charAt(0)<str2.charAt(0)){
		s1=str1;
		s2=str2;
	}
}
	
	id+=s2.charAt(0);
	id+=s1;
	id+=num.charAt(n-1);
	StringBuilder sb=new StringBuilder();
	sb.append(num);
	sb=sb.reverse();
	for(int i=0;i<sb.length();i++){
		 rev+=sb.charAt(i);
	}
	
	id+=rev.charAt(n-1);
	System.out.println(id);
	s.close();
}
}