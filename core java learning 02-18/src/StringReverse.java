package oops;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your string please");
		String str=scanner.nextLine();
		System.out.println("Hello your string is  = "+str);

		int len=str.length();
		System.out.println("Length of string is "+len);
		
		String temp="";
		
		for(int x=0;x<len;x++) {
			char ch=str.charAt(x);
			temp=ch+temp;
		}
		System.out.println("Hello now your string is  = "+temp);
	}

}
