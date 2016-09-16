package com.Study25this和super;

public class Sub extends Base {
    
	public Sub(){
		super(100);//在子类构造函数的第一句话，表示调用带参数，或不带参数的父类。默认有一个super();
		super.a();//与this功能相似。不过是调用父类对象。
		System.out.println("Sub类的初始构造方法");
	}
	public static void main(String[] args) {
		//子类的对象构造时，会先调用父类的构造方法。
		Sub obj = new Sub();

	}

}
