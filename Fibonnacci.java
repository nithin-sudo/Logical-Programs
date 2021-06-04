package logicalprograms;

import java.util.Scanner;

public class Fibonnacci {
	public static void main(String[] args){
		int i,range;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a range: ");
		range = sc.nextInt();
		int a=0,b=1,c;
		System.out.println("fibonnaci series for given range:");
		System.out.println(a);
		System.out.println(b);
		for(i=1;i<range;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}
}
