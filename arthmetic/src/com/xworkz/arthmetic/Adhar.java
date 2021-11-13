package com.xworkz.arthmetic;

public class Adhar {
	public static void main(String a[]){

		long adhaar=getAdhaarNo();
		System.out.println(adhaar);

		String name=getAdhaarName();
		System.out.println(name);
		}

		public static long getAdhaarNo(){
		  long adhaarNo=323265659898L;
		  return adhaarNo;
		}

		public static String getAdhaarName(){
		return "Samprita Ravindra Kulkarni";
		}

}
