package com.Study37finally块;

public class Test1 {
	String x;
	
	public static void main(String[] args) {
		   Test1 test1 = new Test1();
		   try{                    //监听有可能发生异常的代码。
			   System.out.println(5/0);//异常
		   }catch(ArrayIndexOutOfBoundsException e){//一个try块后可以跟多个catch块。
			   test1.x = "hello";
			   System.out.println(test1.x.length());
		   }catch(NullPointerException e){
			   test1.x = "hello";
			   System.out.println(test1.x.length());
		   }catch(Exception e){ //可以捕捉所有异常，最大范围。
			   e.printStackTrace();
		   }finally{      //跟在最后一个catch块之后，必须执行的语句。
			   System.out.println("finally");//不论是否发生异常，都会执行这个块中的代码。
		   }                                //用来关闭链接。
		   
		   System.out.println("end");
		   
		   
        
	}

}
