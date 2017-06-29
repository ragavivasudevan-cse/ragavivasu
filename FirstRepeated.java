package guvi;
import java.util.Scanner;
import java.util.Arrays;
public class FirstRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        String s1="";
        for(int i=0;i<n;i++){
        	a[i]=s.nextInt();
        } for(int i=0;i<n;i++){
        	  s1+=a[i];
        }
       
        String str="";
       
        for(int i=0;i<n;i++){
        if(!str.contains(String.valueOf(s1.charAt(i)))){
        	str+=s1.charAt(i);
        	 
        }else{
        	System.out.println(s1.charAt(i));
        	break;
        }
	}
        s.close();
	}
}
