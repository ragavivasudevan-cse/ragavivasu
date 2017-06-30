package guvi;
import java.util.Scanner;
public class Duplicate {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int flag=0;
	for(int i=0;i<str.length();i++){
		flag=0;
		for(int j=0;j<str.length();j++){
			if((str.charAt(i)==str.charAt(j))&&(i!=j)){
				flag++;
			}
			
		}
		if(flag==0){
			System.out.print(str.charAt(i));
		}
	}
	s.close();
}
}
