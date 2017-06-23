package program;
import java.util.Scanner;
public class Duplicate {
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
String s1=" ";
for(int i=0;i<s.length();i++){
if(s1.contains(s.charAt(i)+"")){
}
else{
	s1+=s.charAt(i);
}
}
System.out.println(s1);
sc.close();
	}
}
