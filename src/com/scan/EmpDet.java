package com.scan;

import java.util.Scanner;

public class EmpDet {
public static void main(String[] args) {
	Scanner t1 =new Scanner(System.in);
	
	System.out.println("Enter the EmployeeID");
	int id = t1.nextInt();
	System.out.println(id);
	
	System.out.println("Enter the Name");
	String str = t1.next();
	System.out.println(str);
	
	System.out.println("Email");
	String mail = t1.next();
	System.out.println(mail);
	
	System.out.println("Phone Number:");
	int ph =t1.nextInt();
	System.out.println(ph);
	
	System.out.println("Salary is:");
	int sal=t1.nextInt();
	System.out.println(sal);
	
	System.out.println("Gender:");
	String Ge=t1.next();
	System.out.println(Ge);
	
	System.out.println("City");
	String cit=t1.nextLine();
	System.out.println(cit);
	
}
}
