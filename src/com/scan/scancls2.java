package com.scan;

import java.util.Scanner;

public class scancls2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println(num);
		System.out.println("enter the word");
		String next = sc.next();
		System.out.println(next);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println(str);
	}
}
