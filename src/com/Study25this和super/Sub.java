package com.Study25this��super;

public class Sub extends Base {
    
	public Sub(){
		super(100);//�����๹�캯���ĵ�һ�仰����ʾ���ô��������򲻴������ĸ��ࡣĬ����һ��super();
		super.a();//��this�������ơ������ǵ��ø������
		System.out.println("Sub��ĳ�ʼ���췽��");
	}
	public static void main(String[] args) {
		//����Ķ�����ʱ�����ȵ��ø���Ĺ��췽����
		Sub obj = new Sub();

	}

}
