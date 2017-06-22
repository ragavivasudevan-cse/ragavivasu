package guvi;
import java.util.Scanner;
public class Three {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp=0;
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int  i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j])
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		
		String str="";
		for(int i=0;i<n;i++){
			str+=a[i];
		}
		int n1=str.length();
		if(n1%3==0){
		for(int i=0;i<n;i+=3){
	       System.out.print(str.substring(i,i+3));
	       if(i<n/3){
	    	   System.out.print(",");
	       }
		}
		}
		else if(n1%3==1){
		  System.out.print(str.charAt(0)+",");
		  for(int i=1;i<n;i+=3){
			  System.out.print(str.substring(i,i+3));
			  if(i<n/3){
		    	   System.out.print(",");
		       }
			  
		}
		}
		else{
			System.out.print(str.substring(0,2)+",");
			for(int i=2;i<n;i+=3){
				  System.out.print(str.substring(i,i+3));
				  if(i<n/3){
			    	   System.out.print(",");
			       }
			}
		}
		sc.close();
	}

}