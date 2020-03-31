# credit-card-checker
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
