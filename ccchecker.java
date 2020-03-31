// vinayakrit 
// Vinayak Patil
// This code is made of an education purpose to show how Luhn algo. works, no other intend behind this code
//have a errorless journey

/*
How Algo. works
1. Double every second digit from right to left. If doubling of a digit results in a two digit number, add up the two digits to get a single-digit number
 dig=3, 3*2=6
 dig=6, 6*2=12=>1+2=3

2. Now add all single-digit result from above
 add1= 6 + 3 + ....

3. Add all digits in the odd places from right to left in the card number
 add2= 9 + 1 + ...

4. Add add1 & add2
 add = add1 + add2
 
5. if add%10 = 0 then valid card
	Luhn says if total sum mod 10 is zero then valid
Ex.
step 1: 
	suppose credit card number is 9878945622378945
 so number = 78945622378945
doubling of every second digit is
	4*2=8			2*2=4			7*2=14 => 1+4=5
	8*2=16 => 1+6=7		5*2=10 => 1+0=1		9*2=18 => 1+8=9
	3*2=6			9*2=18 => 1+8=9

step 2:
	add1= 8 + 7 + 6 + 4 + 1 + 9 + 5 + 9 = 49

step 3:
	add2= 5 + 9 + 7 + 2 + 6 + 4 + 8 + 8 = 53

step 4:
	add= 49 + 53 = 102

step 5: 
	add mod 10 = 102 % 10 = 2
if it is 0 then valid else not valid. Here it is 2 so not valid.
*/

import java.util.Scanner;

class ccchecker
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int count = 0;
		int i =0, j;
		long[] array= new long[17];
		long[] add1= new long[8];
		long[] add2= new long[8];
		int cnt=0, cnt1=0, cnt2=0;
		long val, length;
		long sum=0, sum1=0, sum2=0, x, y;
		long back;
	

		do
		{
			System.out.println("Enter credit card number :");   //  asking user for cc number as input
			long number = in.nextLong();    // iput take in long tyoe
			back = number;

		for(i=0; number !=0; i++)    // this loop will seperate digits from number e.g. 123  1 2 3  & store in array
		{
			array[i]= number%10;
			number = number/10;
			count++;
		}

		}while(count<13);  /// cc must between 13 to 16 
		cnt=count;

		for(i=0; i<cnt; i++)
		{
			if(i%2!=0)   // get every second digit
			{	
				add1[cnt1]= array[i];
				cnt1++;

			}
			else
			{
				add2[cnt2]= array[i];
				cnt2++;
			}
		}

		for(i=0; i<add1.length; i++)
		{
			val=add1[i];
			add1[i]=val*2;  // multiply by 2 step 1 e.g. 3*2
			if(add1[i]>9)
			{
				x=add1[i]%10;    // if result two digit e.g. 6*2=12=>1+2=3
				y=add1[i]/10;
				add1[i]= y + x;

			}
			cnt1++;
			sum1 = sum1 + add1[i];  // add all single-digit result from above  step 2


		}

		for(i=0; i<add2.length; i++)
		{

			sum2 = sum2 + add2[i]; //Add all digits in the odd places from right to left in the card number  step 4
		}
		sum = sum1 + sum2;
		if(sum%10==0)  // Luhn says if total sum mod 10 is zero then valid
		{
			System.out.println(back + "	  is valid");
		}
		else
		{
			System.out.println(back + "	  is not valid");
		}
	}

}

// Don't forget to check my other work 
// alternate account sa4eb on github or visit webpage https://sa4eb.github.io/
