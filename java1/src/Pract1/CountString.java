package Pract1;

import java.util.Scanner;

public class CountString {

	public void Count(String pavan) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=pavan;
		int s3=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s3) {
				s3++;
	}
}
		System.out.println(s3);
	}
}
