package com.Study23方法覆盖;

public class Son extends Father{
//方法体不同，但方法名相同。方法覆盖：子类重写父类的同名方法。
//方法覆盖的原则：1.子类方法的参数必须跟父类方法保持一致。
//2.子类方法的修饰符的范围，必须大于等于父类同名方法的修饰符。
	public void print(){
		System.out.println("Son:print()");
	}
	//方法的重载
	public void print(int x){
		System.out.println("Son:print()");
	}
	public static void main(String[] args) {
		Son objson = new Son();
		objson.print();

	}

}
