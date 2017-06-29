package guvi;
import java.util.Scanner;
public class RemovePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String s1="";
		String s2="";
		
		
		for(int i=0;i<str.length()/2;i++){
			s1+=str.charAt(i);
		}
		
		
		for(int i=str.length()-1;i>=str.length()/2;i--){
			s2+=str.charAt(i);
		}
			
			StringBuffer sb=new StringBuffer(str);
			if(s1.length()==s2.length()){
				sb.delete(str.length()/2,str.length()/2+1);
			
			System.out.println(sb);
		}
			
		s.close();
  
	
	}
}
