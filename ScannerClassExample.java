package com.module1;

import java.util.Scanner;

public class ScannerClassExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the college name :");
		String cname=sc.nextLine();
		
		System.out.println("Enter the college code :");
		int code=sc.nextInt();
		
		System.out.println("The college name is "+ cname + " and the college code is "+ code);
		
	}
	

}
