package com.Study35���Ϻ���Map;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();//������������ʼ����16����ֵ�Եķ�ʽ�洢��
        map.put("s001", "aaa");//key��value���Ƕ����ö�������������
        map.put("s001", "bbb");
        System.out.println(map.size());//����Ϊ1��ǰ��ֵ�����ǡ�
        System.out.println(map.get("s001"));//ͨ��key����ȡkey����Ӧ��value��ֵ��
	}

}
