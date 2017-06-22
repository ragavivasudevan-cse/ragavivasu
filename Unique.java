package guvi;
import java.util.Scanner;
public class Unique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0;
       int[] a=new int[n];
       for(int i=0;i<n;i++){
    	   a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
    	   count=0;
    	   for(int j=0;j<n;j++){
    		   if(a[i]!=a[j]){
    			   count++;
    		   }
    	   }
       if(count==n-1){
    	   System.out.println(a[i]);
       }
       }
       sc.close();
	}

}
