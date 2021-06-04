package logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args){
			int i,number;
			int sum=0;
			Scanner sc = new Scanner(System.in);		
			System.out.println("Enter a Number: ");
			number = sc.nextInt();
			for(i=1;i<number;i++)
			{
				if(number%i==0)
				{
					sum+=i;
				}
			}
			if(sum==number)
				System.out.println("entered number is a perfect number");
			else
				System.out.println("entered number is not a perfect number");
			}
}
