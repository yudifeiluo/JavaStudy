package com.Study23��������;

public class Son extends Father{
//�����岻ͬ������������ͬ���������ǣ�������д�����ͬ��������
//�������ǵ�ԭ��1.���෽���Ĳ�����������෽������һ�¡�
//2.���෽�������η��ķ�Χ��������ڵ��ڸ���ͬ�����������η���
	public void print(){
		System.out.println("Son:print()");
	}
	//����������
	public void print(int x){
		System.out.println("Son:print()");
	}
	public static void main(String[] args) {
		Son objson = new Son();
		objson.print();

	}

}
