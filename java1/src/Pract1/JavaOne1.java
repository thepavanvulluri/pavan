package Pract1;



public class JavaOne1 {
	public static void main(String[] args) {
		String rev="";
		String s1="pavan";
		for(int i=0;i<=s1.length();i++) {
			char c=s1.charAt(i);
			if(rev.indexOf(c)==-1) {
				rev=rev+c;
			}
			
		}
		System.out.println(rev);
	}
}


