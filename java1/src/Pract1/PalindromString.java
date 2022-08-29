package Pract1;

import java.util.Scanner;

public class PalindromString{

	

	public void Pal(String pavan) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
		rev=rev+s1.charAt(i);
	
			
		}
		if(rev.equals(s1)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not a palindrom");
		}
}
}



