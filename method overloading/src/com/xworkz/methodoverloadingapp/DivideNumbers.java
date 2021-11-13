package com.xworkz.methodoverloadingapp;

public class DivideNumbers {

	
	public static void main(String a[]){

		int value=div(456,789);
		System.out.println(value);
		int ans=div(453,234);
		System.out.println(ans);
		int output=div(50056,56746);
		System.out.println(output);
		int finalOutput=div(45321,98765);
		System.out.println(finalOutput);

		div(7865,9876,45666);

		}

		public static int div(int a,int b){
		return a/b;
		}

		public static void div(int a,int b,int c){
		System.out.println(a/b/c);

		}
}
