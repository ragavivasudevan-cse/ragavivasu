package program;
import java.util.Scanner; 
public class DivideArray1 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int[] a=new int[num];
	int[] b=new int[num];
	int[] c=new int[num];
	int count=0;
	int count1=0;
	for(int i=0;i<num;i++){
		a[i]=s.nextInt();
	}
	int n=0;
	int sum=0;
	int sum1=0;
	int flag=0;
	while(n!=num-1){
		count=0;
	for(int i=0;i<=n;i++){
		b[i]=a[i];
		sum+=b[i];
		
		count++;
	}
	
	flag++;
	count1=0;
	for(int i=n+1;i<num;i++){
		c[i]=a[i];
		sum1+=c[i];
		
        count1++;
	}
	
	if(sum/count==sum1/count1){
		System.out.print("[");
		for(int i=0;i<=n;i++){
		System.out.print(b[i]);
		if(i!=n){
			System.out.print(",");
		}
	
		}
		System.out.print("]");
		System.out.print("[");
		for(int i=n+1;i<num;i++){
		System.out.print(c[i]);
		if(i!=num-1){
			System.out.print(",");
		}
	
		}
		System.out.print("]");
		
		break;
	}
	n++;
	sum=0;
	sum1=0;

	
	if(flag==num-1){
		System.out.println("not possible");
	}
	}
	s.close();
}
}
