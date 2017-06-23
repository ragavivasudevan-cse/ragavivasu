package program;
import java.util.Scanner;
public class Subset {
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=sc.nextInt();
int count=0;
int[] a1=new int[n];
int[] a2=new int[n1];
for(int i=0;i<n;i++){
	a1[i]=sc.nextInt();
}
for(int i=0;i<n1;i++){
	a2[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=0;j<n1;j++){
	if(a1[i]==a2[j]){
		count++;
	}
}
}
	if(count==a1.length){
		System.out.println("a1 is subset of a2");
	}
	else{
		System.out.println("a1 is not subset of a2");

	}

sc.close();
}
}