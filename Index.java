package guvi;
import java.util.Scanner;
public class Index {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        	if(i==a[i]){
        		System.out.println(a[i]);
        	}
        }
        sc.close();
	}

}
