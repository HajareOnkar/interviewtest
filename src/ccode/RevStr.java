package ccode;

import java.util.Scanner;

public class RevStr {
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		String s="hi i am omi 123";
		
//		for(int i=s.length()-1;i>=0;i--) {
//			//System.out.print(s.charAt(i));
//			if(Character.isLetter(s.charAt(i))||Character.isWhitespace(s.charAt(i))) {
//				System.out.print(s.charAt(i));
//			}
//		}
		
		String[] st=s.split(" ");
		
		for(String ss:st) {
			if(Character.isLetter(ss.charAt(0))) {
				StringBuilder sb=new StringBuilder(ss);
			    System.out.print(sb.reverse()+" ");
				
			}
			else {
				System.out.println(ss);
			}
		}
		
		
	
		
		
		
	}

}
