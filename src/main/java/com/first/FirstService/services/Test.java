package com.first.FirstService.services;

import java.util.Base64;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Natural  number");
//		int n=sc.nextInt();
//		int num=1;
//		for(int i=1;i<=10;i++) {
//			System.out.println(n*i);
//		}
		int n = 4;
		int m = 5;
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print("*");
				} else {
					System.out.println(" ");
				}
			}
			 System.out.println();
		}
		
	}
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("Enter num for Operation");
//		System.out.println("1 for Addition");
//		System.out.println("2 for subtraction");
//		System.out.println("3 for Multiplication");
//		int choise=sc.nextInt();
//		switch(choise) {
//		case 1:
//			int c=a+b;
//			System.out.println("Addition is "+c);
//		    break;
//		case 2:
//			int d=a-b;
//			System.out.println("sub is "+d);
//		    break;
//		case 3:
//			int e=a*b;
//			System.out.println("Multiplication is "+e);
//		    break;
//		default:
//			System.out.println("Wrong Choise");
//		    
//		}
//		

//		String str = "MrVirat Kohali";
//		byte[] byteStr = str.getBytes();
//		byte[] enc = Base64.getEncoder().encode(byteStr);
//		String encString = new String(enc);
//		System.out.println("--------" + encString);
//
//		// decode
//		byte[] dec = Base64.getDecoder().decode(enc);
//		String decStr = new String(dec);
//		System.out.println("Dec str----" + decStr);
//		System.out.println("Decode origional Str--->" + decStr.substring(2));
//		try(Scanner scanner = new Scanner(System.in);){
//		System.out.println("ENter the two Numbers");
//		int num1 = scanner.nextInt();
//		int num2= scanner.nextInt();
//		if (num1==num2) {
//			System.out.println("both equal");
//			
//		}
//		else if(num1 > num2) {
//			System.out.println(num1+">"+num2+"number 1 is greater number 2");
//		}
//		else  {
//			System.out.println("num2 i");
//			
//		}
//	}\

}
