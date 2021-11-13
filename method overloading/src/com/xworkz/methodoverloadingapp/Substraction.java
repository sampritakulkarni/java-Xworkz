package com.xworkz.methodoverloadingapp;

public class Substraction {

	
	public static void main(String a[]){

		int value=sub(56,89);
		System.out.println(value);
		int ans=sub(67,345);
		System.out.println(ans); 
		int output=sub(78,456);
		System.out.println(output); 
		int finalOutput=sub(7890,6785);
		System.out.println(finalOutput);

		sub(45,45,45);

		}

		public static int sub(int a, int b){
		return a-b;
		}
		public static void sub(int a, int b, int d){
		  System.out.println(a+b+d);
		}
}
