package com.Study24多态方法的调用;

public class Son extends Father{

	public void print(){
		System.out.println("Son:print");
	}
	
	public void a(){
		System.out.println("Son:a()");
	}
	//Father obj1 = obj2
	//相当于把子类的对象赋给了父类对象类型的参数。
	public void a1(Father obj1){
		//System.out.println("Son:a1()");
		obj1.print();//调用的子类的print()方法。
	}
	public static void main(String[] args) {
		//父类 对象 = new 子类();多态  面向对象四大特征：抽象、封装、继承、多态。
		Father obj = new Son();//obj 只能属于Father类型。
        obj.print();//obj指向子类，调用子类方法。
        Son obj2 = new Son();
        obj2.a1(obj2);
       //报错，因为obj由Father声明，obj没有办法超出Father的范围，只能调用子类覆盖和继承父类中的属性和方法。
        //obj.a();
        Father obj3 = new Father();//一个父类可以有多个子类，所以父类对象可以动态指向不同的子类。
	}                         //子类的对象绝对不可以new父类。

}
