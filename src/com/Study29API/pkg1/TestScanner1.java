package com.Study29API.pkg1;
import java.util.Scanner;//����Scanner�ࡣѧ��ʹ��API�ĵ���
public class TestScanner1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//�� java.util ���У��赼�롣
		                            //System.in ָ���̡�
        System.out.println("�����������ַ�����");
        System.out.println("�û�������ַ����ǣ�"+scanner.next());
	}

}

/*�����������ַ�����
hello
�û�������ַ����ǣ�hello*/