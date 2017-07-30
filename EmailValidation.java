package program;
import java.util.Scanner;
public class EmailValidation {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String ss=s.next();
	int count=0;
	int count1=0;
	int flag=0;
	for(int i=0;i<ss.length();i++){
		if(ss.charAt(i)=='@'){
			count++;
		}
		if(ss.charAt(i)=='.'){
			count1++;
		}
	}
	if(count==1&&count1==1){
		if(ss.substring(ss.indexOf('@'),ss.indexOf('.')).length()==4){
			flag++;
		
		}
		if(ss.substring(0,ss.indexOf('@')).length()>=3){
			flag++;
		
			
		}
		if(ss.substring(ss.length()-4,ss.length()).equals(".com")){
			flag++;
			
		}
	}
		if(flag==3){
			System.out.println("valid email.id");
		}
		else{
			System.out.println("not a valid email.id");
		}
	}
}

