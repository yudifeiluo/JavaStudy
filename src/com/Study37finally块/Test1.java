package com.Study37finally��;

public class Test1 {
	String x;
	
	public static void main(String[] args) {
		   Test1 test1 = new Test1();
		   try{                    //�����п��ܷ����쳣�Ĵ��롣
			   System.out.println(5/0);//�쳣
		   }catch(ArrayIndexOutOfBoundsException e){//һ��try�����Ը����catch�顣
			   test1.x = "hello";
			   System.out.println(test1.x.length());
		   }catch(NullPointerException e){
			   test1.x = "hello";
			   System.out.println(test1.x.length());
		   }catch(Exception e){ //���Բ�׽�����쳣�����Χ��
			   e.printStackTrace();
		   }finally{      //�������һ��catch��֮�󣬱���ִ�е���䡣
			   System.out.println("finally");//�����Ƿ����쳣������ִ��������еĴ��롣
		   }                                //�����ر����ӡ�
		   
		   System.out.println("end");
		   
		   
        
	}

}
