package logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
			int i,number,k = 0;
			Scanner sc = new Scanner(System.in);		
			System.out.println("Enter a Number: ");
			number = sc.nextInt();
			if(number<=0||number==1)
				System.out.println(number+"is not a prime number");
			else
			{
				k=0;
				for(i=2;i<number;i++)
				{
					if(number%i==0)
						k=1;break;
				}
			}
			if(k==0)
				System.out.println("prime");
			else
				System.out.println("not prime");
	}
}	