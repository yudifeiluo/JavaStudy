package com.Study32Math函数.pkg1;

public class Test2 {

	public static void main(String[] args) {
		// E和PI都是public static double final值，都只能被赋值一次。
		System.out.println(Math.E+"\n"+Math.abs(-3.5));
		System.out.println(Math.ceil(3.5)+"\n"+Math.floor(3.5));//ceil:>= max floor:<= min
		//2的3次方。random:随机数 0——1之间的double值。round:四舍五入。
		System.out.println(Math.pow(2,3)+"\n"+Math.random()+"\n"+Math.round(3.5));
	}

}
