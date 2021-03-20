package com.javaprograms.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString_01 {
	
	public static void main(String[] args) {
//		Kranthi method - 1
//		String a = "sp software private limited";
//		int size = a.length();
//		byte[] byteArray = a.getBytes();
//		byte[] resultByte = new byte[byteArray.length];
//		for(int i=0;i<size;i++)
//		{
//			resultByte[i] = byteArray[size-i-1];
//		}
//		String reverseString = new String(resultByte);
//		System.out.println("Reverse of ** "+a+" ** is : "+reverseString);
//		
//		Kranthi method - 2		
//		String name = "SP SOFTWARE PRIVATE LIMITED";
//		int size = name.length();
//		for(int i = size-1;i>=0;i--)
//		{
//			System.out.print(name.charAt(i));
//		}
		
		
//		############ Method - 1 ##########
		
//		String name = "sp software private limited";
//		byte[] nameAsBytes = name.getBytes();
//		byte[] result = new byte[nameAsBytes.length];
//		for (int i = 0; i < result.length; i++) {
//			result[i] = nameAsBytes[result.length-i-1];
//		}
//		System.out.println(new String(result));
		
//		############ Method - 2 ##########
//		************* This is using StringBuilder Class ***************
		
//		String name = "SP SOFTWARE PRIVATE LIMITED";
//		StringBuilder sb = new StringBuilder();
//		sb.append(name);
//		sb.reverse();
//		System.out.println(sb);
		
//		############ Method - 3 ##########
//		************* This is using StringBuffer Class ***************
		
//		String name = "SP SOFTWARE PRIVATE LIMITED";
//		StringBuffer sb = new StringBuffer();
//		sb.append(name);
//		sb.reverse();
//		System.out.println(sb);
		
		
		
//		String name = "SP SOFTWARE PRIVATE LIMITED";
//		char[] charArray = name.toCharArray();
//		List<Character> list = new ArrayList();
//		
//		for(int i=0;i<charArray.length;i++)
//		{
//			list.add(charArray[i]);
//		}
//		
//		Collections.reverse(list);
//		System.out.println(list);
//		ListIterator<Character> itr = list.listIterator();
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next());
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
