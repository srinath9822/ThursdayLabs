package com.example;

import java.util.Scanner;

public class SumOfDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        a = s.nextInt();
        while(a > 0)
        {
            b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        System.out.println("Sum of Digits:"+sum);
        s.close();

	}

}
