package guvi;
import java.util.Scanner;
public class Balance {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int count=0;
	int count1=0;
	char[] ch=str.toCharArray();
	for(int i=0;i<str.length();i++){
		if((ch[i]>='A'&&ch[i]<='M')||(ch[i]>='a'&&ch[i]<='m')){
			count++;
		}
		else{
			count1++;
		}
	}
	if(count==count1){
		System.out.print("balanced");
	}
	else{
		System.out.print("unbalanced");
	}
    s.close();
}
}
