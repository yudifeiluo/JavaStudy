package com.Study25this��super;

public class Base {
     public Base(){
    	  System.out.println("Base��ĳ�ʼ���췽����");
      }
      public Base(int x){
    	  System.out.println("Base������ع��췽����");
      }
      public void a(){
    	  System.out.println("Base��a()");
      }
      public void b(){
    	  //thisָ��ͨ�õĶ������ĸ������棬��ָ�������ĸ��ࡣ
    	  this.a();//��b()�е���a()������a,bƽ����
      }
      public static void main(String[] args)
      {
    	  Base obj = new Base();
    	  obj.b();
      }

 }
/*
Base��ĳ�ʼ���췽����
Base��a()
*/
