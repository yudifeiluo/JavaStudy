package com.Study27接口.pkg1;
//抽象类
public abstract class Animal {
	public /*protected private 或缺省*/String name;//抽象类可以有成员变量。
	//抽象类也可以有构造方法。
    public Animal(){
	
     }
    //抽象类也可以有成员方法。
    /*public void eat(){
    	
    }*/
    public abstract void eat();
    //抽象类与普通类最重要的区别是抽象类可以有抽象方法。抽象方法是指没有方法体的方法。
    //普通方法花括号{}内的内容即为方法体。
    //抽象方法
   // public abstract void abstractMethod1();//没有{}方法体，记住要加“abstract”关键字。
    
}
//1.抽象类必须写abstract声明。
//2.抽象类中有抽象方法，abstract 声明且没有方法体
//3.抽象方法的目的就是为了被子类继承且覆盖。抽象类只是提出了一个方法的定义，而子类则去具体的实现。