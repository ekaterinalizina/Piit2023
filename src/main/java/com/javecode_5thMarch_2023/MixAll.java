package com.javecode_5thMarch_2023;

public class MixAll {

	public static void main(String[] args) {
		
		int i = 1;
		int j = --i;//0
		int k = i++ - --i + i++;//0 - 1 +0
		int l = j++ + ++k + --i - i--;//1 -0 -1
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}

}
