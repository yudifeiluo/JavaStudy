package com.Study36风险控制;

public class Test1 {
	String x;
	
	public static void main(String[] args) {
		   Test1 test1 = new Test1();
		   try{                    //监听有可能发生异常的代码。
			   System.out.println(test1.x.length());//空指针，有风险。 
		   }catch(ArrayIndexOutOfBoundsException e){//一个try块后可以跟多个catch块。
			   test1.x = "hello";
			   System.out.println(test1.x.length());
		   }catch(NullPointerException e){
			   test1.x = "hello";
			   System.out.println(test1.x.length());
		   }catch(Exception e){ //可以捕捉所有异常，最大范围。
			   e.printStackTrace();
		   }
		   
		   System.out.println("end");
		   
		   
        
	}

}
