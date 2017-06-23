package program;
import java.util.Scanner;
public class Day {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	if(str.equals("sunday")||str.equals("saturday")){
		System.out.println("false");
	}
	else{
		System.out.println("true");
	}
	s.close();
}
}
