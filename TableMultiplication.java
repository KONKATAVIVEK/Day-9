package com.codegnan.controlstatements;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter num");
		int num=scanner.nextInt();
		System.out.println("multiplication table:+num");
	for(int i=1;i<=20;i++) {
			System.out.println(num +"*"+i+ "="+(num*i));
			}
		scanner.close();
		
	}

}
