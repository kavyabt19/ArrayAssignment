package com.Xworkz.controlStatement;

public class SumOfIndex {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int num[] = { 5, 8, 10, 15, 56, 20, 25, 45, 30, 35, 40, 88, 45, 50, };
		for (int i = 0; i < num.length; i++)
			if(num[i]%1==0)
			sum = sum + i;
		{

			System.out.println("Sum of Array index  is = " + sum);

		}

	}

}
