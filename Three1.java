package guvi;
import java.util.Scanner;
public class Three1 {

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
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
					int temp=a[i];
					a[i]=a[j];
				a[j]=temp;
				}
}
		}
		
		String s="";
		for(int i=0;i<n;i++){
			s+=a[i];
		}
		int n1=s.length();
		if(n1%3==0){
			for(int i=0;i<n;i+=3){
			System.out.print(s.substring(i,i+3));
			if(i<n/3){
				System.out.print(",");
			}
		}
		}
		else if(n1%3==1){
			System.out.print(a[0]);
			for(int i=1;i<n;i+=3){
				System.out.print(s.substring(i,i+3));
				if(i<n/3){
					System.out.print(",");
				}
			}
		}
		else{
			System.out.print(a[0]+","+a[1]);
			for(int i=2;i<n;i+=3){
				System.out.print(s.substring(i,i+3));
				if(i<n/3){
					System.out.print(",");
				}
			}
		}
		sc.close();
	}

}
