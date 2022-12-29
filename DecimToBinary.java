package com.example;

import java.util.Scanner;

public class DecimToBinary {
	static void Convert(int n)
	{
		int[] binaryNum = new int[1000];

		int i = 0;
		while (n > 0)
		{
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		 System.out.print("Binary - ");

		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a decimal number");
	        int a=sc.nextInt();
	        Convert(a);
		}
	       

	}

}


