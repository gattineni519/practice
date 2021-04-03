package com.example.demo;

public class Test {

	public static void main(String[] args) {
			
		System.out.println(a());

	}

	public static String a() {
		try {
			return "try";
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			return "finally";
		}
		
	}
}
