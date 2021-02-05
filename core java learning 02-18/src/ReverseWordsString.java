package oops;

import java.util.Scanner;

public class ReverseWordsString {
	
	
	static String reverse(String input) {
		int len=input.length();
		String temp="";
		for(int x=0;x<len;x++) {
			char ch=input.charAt(x);
			temp=ch+temp;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your string please");
		String str=scanner.nextLine();
		//Nagendra    Kumar   Java   Hunk
		//tokens[] = {"Nagendra","Kumar","Java","Hunk"};
		String tokens[]=str.split("[ ]+");
		String output="";
		for(String t:tokens) {
			output = output + "  "+reverse(t);
		}
		System.out.println("Hello now your string is  = "+output);
	}

}
