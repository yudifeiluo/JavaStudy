package com.Study36���տ���;

public class Test1 {
	String x;
	
	public static void main(String[] args) {
		   Test1 test1 = new Test1();
		   try{                    //�����п��ܷ����쳣�Ĵ��롣
			   System.out.println(test1.x.length());//��ָ�룬�з��ա� 
		   }catch(ArrayIndexOutOfBoundsException e){//һ��try�����Ը����catch�顣
			   test1.x = "hello";
			   System.out.println(test1.x.length());
		   }catch(NullPointerException e){
			   test1.x = "hello";
			   System.out.println(test1.x.length());
		   }catch(Exception e){ //���Բ�׽�����쳣�����Χ��
			   e.printStackTrace();
		   }
		   
		   System.out.println("end");
		   
		   
        
	}

}
