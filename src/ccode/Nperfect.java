package ccode;

import java.util.Scanner;

public class Nperfect {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int num=sc.nextInt();
		int n=num;
		
		
		for(int i=1;i<=num;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
			
		}
	}

}
