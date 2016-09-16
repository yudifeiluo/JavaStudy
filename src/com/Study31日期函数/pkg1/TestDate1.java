package com.Study31日期函数.pkg1;
import java.util.Calendar;
import java.util.Date;
public class TestDate1 {
    private Date date;//Date既可以做为成员方法成员变量中的东西。也可以在main方法中来做。
	Calendar cal; // Calendar 为抽象类。
    public TestDate1(){
		/*date = new Date();//构造方法里面初始化date对象。
		Date date2 = new Date();
System.out.println(date+"\n"+date.getDay()+"\n"+date.after(date2));//date作为成员变量,调用getDay函数。
	*/
    	//cal = new Calendar;//报错，Calendar为抽象类不可以new自己。
    	cal = Calendar.getInstance();//getInstance()为static静态方法，可以直接打点调用。
    	System.out.println(cal+"\n"+cal.YEAR);//静态的变量和方法，用类名打点调用和用对象打点调用都是一样的效果。
    	System.out.println(cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1));
    }          //get不是静态的，所以必须用对象打点调用。
    public static void main(String[] args) {
           
    TestDate1 obj = new TestDate1();//只有使用new才能真正调用构造方法。
	}

}

/*
 Mon Jan 11 18:48:53 CST 2016
1
false
 */
 