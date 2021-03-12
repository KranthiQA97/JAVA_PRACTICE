package com.javaprograms.demo;

public class ReverseString_01 {
	
	public static void main(String[] args) {
//		Kranthi method
//		String a = "sp software private limited";
//		
//		
//		int size = a.length();
//		for(int i=size-1 ; i>=0 ;i--)
//		{
//			char ch =  a.charAt(i);
//			System.out.print(ch);
//		}
		
//		############ Method - 1 ##########
		
		String name = "sp software private limited";
		byte[] nameAsBytes = name.getBytes();
		byte[] result = new byte[nameAsBytes.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = nameAsBytes[result.length-1];
		}
		System.out.println(new String(result));
	}

}
