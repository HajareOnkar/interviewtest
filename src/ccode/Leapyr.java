package ccode;

import java.util.Scanner;

public class Leapyr {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any no");
	int yr=sc.nextInt();
	
	if((yr%4==0)&&(yr%100!=0)||(yr%400==0)) {
		System.out.println("leap");
	}
	else {
		System.out.println("not");
	}
}
}
