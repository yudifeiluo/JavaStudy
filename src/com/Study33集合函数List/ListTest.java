package com.Study33���Ϻ���List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();//��ʼ����Ϊ10�Ŀ��б�
        //LinkeListΪ�����б��ʵ�֡�ArrayListΪ�ɱ������ʵ�֡�
		//LinkedList alist = new LinkedList();
		//��ʼ����Ϊ��1,1��
		//Vector alist = new Vector(1,1);
		
		alist.add(10);//Object���ͼ�Ϊ�������͡�
        alist.add("hello");
        //�������е�Ԫ�ء�
        int size = alist.size();//�����б��е�Ԫ������
        
        for(int i=0;i<size;i++){
        	System.out.println(alist.get(i));
        }
        
	}

}
