package com.Study24��̬�����ĵ���;

public class Son extends Father{

	public void print(){
		System.out.println("Son:print");
	}
	
	public void a(){
		System.out.println("Son:a()");
	}
	//Father obj1 = obj2
	//�൱�ڰ�����Ķ��󸳸��˸���������͵Ĳ�����
	public void a1(Father obj1){
		//System.out.println("Son:a1()");
		obj1.print();//���õ������print()������
	}
	public static void main(String[] args) {
		//���� ���� = new ����();��̬  ��������Ĵ����������󡢷�װ���̳С���̬��
		Father obj = new Son();//obj ֻ������Father���͡�
        obj.print();//objָ�����࣬�������෽����
        Son obj2 = new Son();
        obj2.a1(obj2);
       //������Ϊobj��Father������objû�а취����Father�ķ�Χ��ֻ�ܵ������า�Ǻͼ̳и����е����Ժͷ�����
        //obj.a();
        Father obj3 = new Father();//һ����������ж�����࣬���Ը��������Զ�ָ̬��ͬ�����ࡣ
	}                         //����Ķ�����Բ�����new���ࡣ

}
