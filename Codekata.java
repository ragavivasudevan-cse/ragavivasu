package program;
import java.util.Scanner;
public class Codekata {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String str1=s.next();
	String s1="";
	String s2="";
	for(int i=0;i<str.length();i++){
		int n=(int)str.charAt(i)+10;
	    s1+=(char)n;
}
	s2+=str1.charAt(0);
	int n=(int)str1.charAt(1)+10;
    s2+=(char)n;
     n=(int)str1.charAt(2)-16;
    s2+=(char)n;
    s2+=str1.charAt(str1.length()-1);


	System.out.println(s1+" "+s2);
	s.close();
}
}
