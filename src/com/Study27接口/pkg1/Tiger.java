package com.Study27接口.pkg1;
//抽象类的抽象方法一旦建立，就必须被下面的子类继承和覆盖。也就是必须被子类所使用，要不然就会报错。
public class Tiger extends Animal {
    //子类中的方法覆盖了父类中的抽象方法eat(),必须写方法体。
	public void eat(){
    	System.out.println("Tiger eats meats.");
    }
}
