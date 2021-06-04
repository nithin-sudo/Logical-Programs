package logicalprograms;
import java.util.*;
public class CouponNumber {
public static void main(String[] args) {
	System.out.println("Program for Calling Coupon Numbers");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no.of distinct values");
	int nmb=sc.nextInt();
	Random ran= new Random();
	int distinct[]= new int[nmb];
	for(int i=0;i<nmb;i++)
	{
	int dist=ran.nextInt(100)+1;
	if(i==0) distinct[i]=dist;
	else
	{for(int j=0;j<i;j++) 
		{if(dist==distinct[j]) {i--; break;}
			else if (j==i-1) distinct[i]=dist;}
	}
	}
	System.out.println(Arrays.toString(distinct));
	int count=0,k=0,Tik=0;
	int coup1[]= new int[100];
	while(count<nmb)
	{
		int coupon=ran.nextInt(100)+1;
		coup1[Tik]=coupon;
		if (Tik>0)
		{ Tik++;	
		for(int a=0;a<Tik;a++)
			if(coupon==coup1[a]) Tik--; break;}
		else
		{ Tik++;
			for(int j=0;j<distinct.length;j++)
			if (coupon==distinct[j])
				count++;
				System.out.println(count);
				System.out.println("Coupon Number "+coupon+" is got in"+Tik+" random number");
				break;}
	}
}
}
