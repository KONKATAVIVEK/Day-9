package com.codegnan.javafundamentals;

import java.util.Scanner;

public class factorialnum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the  num to factorial");
		int num=scanner.nextInt();
		int result=1;//initial result is 1
		for(int i=1;i<=num;i++) {
			result=result*i;
			}
		System.out.println("factorial of:" + num + "is" + result);
		

	}

}
