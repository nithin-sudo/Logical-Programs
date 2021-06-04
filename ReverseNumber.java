package logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args){
		int number,remainder = 0,reverse = 0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter a Number: ");
		number = sc.nextInt();
		while(number != 0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number /= 10;
		}
		System.out.println("the reversal of number is"+reverse);
	}
}
