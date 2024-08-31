package ccode;
import java.util.*;

public class NoOfPrime {
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no");
		int num=sc.nextInt();
		int n=num;
        
		
		for(int i=2;i<=n;i++) {
			
			int flag=0;
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					flag=1;
					break;
				}
				else {
					flag=0;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}
			
		}
		
	
	}

}
