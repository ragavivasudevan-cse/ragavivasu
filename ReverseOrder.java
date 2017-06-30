package guvi;
import java.util.Scanner;
public class ReverseOrder {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String[] split=str.split(" ");
	for(int i=split.length-1;i>=0;i--){
		System.out.print(split[i]+" ");
	}
	s.close();
}
}
