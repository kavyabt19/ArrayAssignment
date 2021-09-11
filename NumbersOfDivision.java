package com.Xworkz.controlStatement;

public class NumbersOfDivision {

	public static void main(String[] args) {
		 
		int num[] = { 5,8, 10, 15,56, 20, 25,45, 30,35, 40, 88,45, 50,};
		for (int i = 0; i < num.length; i++)
			if (num[i] % 2 == 0 && num[i] % 3 == 0)
			{

				System.out.println("Division of 2 & 3 is=  " +num[ i]);

			}

	}

}
