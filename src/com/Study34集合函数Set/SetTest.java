package com.Study34���Ϻ���Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class SetTest {

	public static void main(String[] args) {
		//TreeSet���Ը���Ԫ�ص���Ȼ˳���������
		//TreeSet set = new  TreeSet();
		//����Set�ĵײ����ݽṹ��ͬ��һ���Ƕ�������һ���ǹ�ϣ��
		HashSet set = new HashSet();
		set.add(10);
		set.add(7);
		set.add(1);
		//�������ϣ�Iterator�ӿڵ�������Set����ת����һ����������
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
        	Object obj = iterator.next();
        	System.out.println(obj);
        }
	}

}
