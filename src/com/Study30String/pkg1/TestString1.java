package com.Study30String.pkg1;

public class TestString1 {

	public static void main(String[] args) {
		String name = "hello world";//��1�ָ�ֵ��ʽ����StringҲ��һ���ࡣ
		String s = new String("  aaa  ");//2.�ֿ���ͨ�����췽ʽ������һ��String���͵Ķ���������
                       //��һ�ָ�����һЩ���ڶ����ǶԶ�������ã����ڴ��л������������      
		int x = name.length();
		char c = name.charAt(0);
		String s1 = name.substring(5);
		String s2 = name.substring(5,8);
		String s3 = s.trim();
		StringBuffer sb1 = new StringBuffer("hello world");//����������ݿɱ䣬String���Ͳ��ɱ䡣
		sb1.append("hahaha");                              //��ı�ֻ�����¸�ֵ��  
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+x+"\n"+c+"\n"+sb1);
		System.out.println(sb1.toString());//��StringBufferת������String���͡�
		
	}
     //class A extends String;//������ΪStringΪfinal�����࣬���ܱ��̳С�
}
/*
11
h
 */
 