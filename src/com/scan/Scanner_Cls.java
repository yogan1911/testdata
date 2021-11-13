package com.scan;

import java.util.Scanner;

public class Scanner_Cls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();// just type sc.nextInt()then, press crtl+2,L it will change like this
		// int nextInt is an referrence name, so we can change it to any name, now it is
		// n.

		System.out.println(n);
	}
}
