package program;
import java.util.Scanner;
public class SubstringSame {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	String ss="";
	String str="";
	for(int i=0;i<s1.length()-1;i++){
		for(int j=0;j<s2.length()-1;j++){
			if((s1.charAt(i)==s2.charAt(j))&&(s1.charAt(i+1)==s2.charAt(j+1))){
			  ss+=s1.charAt(i);
			  ss+=s1.charAt(i+1);
     
			}
		}
	}
	
	for(int i=0;i<ss.length();i++){
	if(!str.contains(String.valueOf(ss.charAt(i)))){
		str+=ss.charAt(i);
		
	}
	}
	System.out.println(str);
	s.close();
}
}
