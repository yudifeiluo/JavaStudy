package com.Study12��һ��App;
/*����10λѧ���ĳɼ������ж����ǵĳɼ�������һ���ȼ���90����100 A����80����89 B���� 
 * 70����79 C���� 60����69 D���� 60����ΪE����*/
import java.util.Scanner;
public class App1 {
	public static void main(String[] args) {
		double[] Scores = new double[10];
		Scanner s = new Scanner(System.in);
		//��ȡkeyboard input ���� give it to scores����Ԫ�ء�
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("�������"+i+"λѧ���ĳɼ���");
			Scores[i] = s.nextDouble();
		}
		for(int j = 0 ; j < 10 ; j++){
			double temp = Scores[j];
			if(temp >= 90 && temp <= 100){
				System.out.println("��"+j+"λѧ���ĳɼ��ȼ���A");
			}else if(temp >= 80 && temp <= 89){
				System.out.println("��"+j+"λѧ���ĳɼ��ȼ���B");
			}else if(temp >= 70 && temp <= 79 ){
				System.out.println("��"+j+"λѧ���ĳɼ��ȼ���C");
			}else if(temp >= 60 && temp <= 69){
				System.out.println("��"+j+"λѧ���ĳɼ��ȼ���D");
			}else if(temp <= 59){
				System.out.println("��"+j+"λѧ���ĳɼ��ȼ���E");
			}
			}
		}
	}


