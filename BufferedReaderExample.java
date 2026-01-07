package com.module1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your country name : ");
		String name=br.readLine();
		
		System.out.println("Enter your country code : ");
		int code=Integer.parseInt(br.readLine());
		
		System.out.println("The country name is " + name+ " and the country code is "+ code);
		
	}
	

}
