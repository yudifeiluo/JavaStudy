package com.Study30String.pkg1;

public class TestString1 {

	public static void main(String[] args) {
		String name = "hello world";//第1种赋值方式。但String也是一个类。
		String s = new String("  aaa  ");//2.又可以通过构造方式来构造一个String类型的对象或变量。
                       //第一种跟更好一些，第二种是对对象的引用，在内存中会产生两个对象。      
		int x = name.length();
		char c = name.charAt(0);
		String s1 = name.substring(5);
		String s2 = name.substring(5,8);
		String s3 = s.trim();
		StringBuffer sb1 = new StringBuffer("hello world");//类型里的内容可变，String类型不可变。
		sb1.append("hahaha");                              //想改变只能重新赋值。  
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+x+"\n"+c+"\n"+sb1);
		System.out.println(sb1.toString());//由StringBuffer转换成了String类型。
		
	}
     //class A extends String;//报错，因为String为final最终类，不能被继承。
}
/*
11
h
 */
 