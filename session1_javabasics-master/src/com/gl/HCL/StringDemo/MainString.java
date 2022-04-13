package com.gl.HCL.StringDemo;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String fName = "Ram";
//		String sName = "Ma'am";
//		String lName = new String ("Ram");
//		String date = "12/12/2022";
//		if(fName == lName) {
//			System.out.println("Both ram are same");
//		}
////		System.out.println("fName = "+fname.length());
////		System.out.println("lName = "+lName.length());
//		System.out.println("Name in Upper Case "+fName.toUpperCase());
//		String subString[] = date.split("/");
//		for(int i=0;i<subString.length;i++) {
//			System.out.println("the data="+subString[i]);
//		}
//		
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer);
		StringBuilder builder = new StringBuilder("Hi");
		System.out.println(builder);
	}

}
