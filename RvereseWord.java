 package program;
 import java.util.Scanner;
 class ReverseWord{
	 public static void main(String[] args){
		 Scanner s=new Scanner(System.in);
		 String str=s.nextLine();
		 String[] word=str.split("\\s");
		 for(int i=0;i<word.length;i++){
		if(i%2!=0){
			System.out.print(word[i]+" ");
			}else{
				StringBuilder sb=new StringBuilder(word[i]);
				sb.reverse();
				System.out.print(sb+" ");
				}
        }
		
	 }
 }