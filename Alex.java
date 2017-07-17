package program;
import java.util.Scanner;
public class Alex {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int flag=0;
	System.out.println("Enter the value of n");
	int n=s.nextInt();
	System.out.println("Enter the value of k");
	int k=s.nextInt();
	String[] bin=new String[n];
	System.out.println("Enter the binary string");
	for(int i=0;i<n;i++){
		bin[i]=s.next();  
	}
	int[] id=new int[k];
	System.out.println("enter the id_numbers");
	for(int i=0;i<k;i++){
	id[i]=s.nextInt();
	int num=id[i];
		if(bin[num-1]=="0"){
		flag++;
	}
	}
	if(flag>0){
		System.out.println("yes");
		
	}else{
		System.out.println("no");
	}

	s.close();
}
}