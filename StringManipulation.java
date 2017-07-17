package program;
import java.util.Scanner;
public class StringManipulation {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int max=-1;
	int min=99999;
	int sum=0;
	int sum1=1;
	int sum2=0;
	int sum3=0;
	for(int i=0;i<str.length();i++){
		if(Character.isDigit(str.charAt(i))){
			int n=Character.getNumericValue(str.charAt(i));
			
			if(n>max){
				
				max=n;
			}
			if(n<min){
				min=n;
			}
		}
	}
	
	for(int i=0;i<str.length();i++){
		if(Character.isDigit(str.charAt(i))){
			int n1=Character.getNumericValue(str.charAt(i));
			sum+=max*n1;
			sum1*=min+n1;
			
		}
}
	
	while(sum>9){
		sum2=0;
	while(sum!=0){
		int rem=sum%10;
		sum2+=rem;
		sum/=10;
		
	}
	
	sum=sum2;
	
}
	
	while(sum1>9){
		sum3=0;
		while(sum1!=0){
			int rem1=sum1%10;
			sum3+=rem1;
			sum1/=10;
			
		}
		
		sum1=sum3;
	}
	
	
	if(sum2>sum3){
		System.out.println((int)Math.pow(sum3,2));
	}
	else{
		System.out.println((int)Math.pow(sum2,2));
	}
	s.close();
}
}
