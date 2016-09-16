package com.Study25this和super;

public class Base {
     public Base(){
    	  System.out.println("Base类的初始构造方法：");
      }
      public Base(int x){
    	  System.out.println("Base类的重载构造方法：");
      }
      public void a(){
    	  System.out.println("Base：a()");
      }
      public void b(){
    	  //this指代通用的对象。在哪个类里面，就指代调用哪个类。
    	  this.a();//在b()中调用a()方法，a,b平级。
      }
      public static void main(String[] args)
      {
    	  Base obj = new Base();
    	  obj.b();
      }

 }
/*
Base类的初始构造方法：
Base：a()
*/
