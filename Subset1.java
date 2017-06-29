package guvi;
import java.util.Scanner;
public class Subset1 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
	if(s1.contains(s2)){
		System.out.println(s1.indexOf(s2.charAt(0)));
	}
	else{
		System.out.println(-1);
	}
	s.close();
}
}
