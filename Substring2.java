package program;
import java.util.Scanner;
public class Substring2 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String ss=s.next();
	String str="";
	for(int i=1;i<ss.length();i++){
		str="";
		str+=ss.charAt(0);
	     str+=ss.charAt(i);
	     System.out.println(str);
	}
	
	s.close();
}
}
