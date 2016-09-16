package com.Study27接口.pkg1;
//接口类，接口也是抽象的，也有成员变量和成员方法。
//1.接口中的方法全部是抽象方法。
public interface Person {
 //public void a(){}//报错，因为接口类中只有抽象方法，不可以有加了方法体的方法。
	public abstract void a();//abstract可以不加，是默认的。因为方法全部是抽象的。
//2.接口中的成员变量必须是final区域的，即必须被初始化。且只能被初始化一次，不能再被赋值。
//public static final 接口成员变量全部是这三种类型，即使不写也是被默认的。
	public static final int age = 1;
}
//定义接口和抽象类最终目的都是为了被继承。