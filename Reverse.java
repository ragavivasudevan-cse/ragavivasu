package program;
import java.util.Scanner;
public class Reverse {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1="";
	String[] s2=s.split(" ");
    for(int i=s2.length-1;i>=0;i--){
		s1+=s2[i]+" ";
	}
	System.out.println(s1);
	sc.close();
}
}
