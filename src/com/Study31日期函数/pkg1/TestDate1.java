package com.Study31���ں���.pkg1;
import java.util.Calendar;
import java.util.Date;
public class TestDate1 {
    private Date date;//Date�ȿ�����Ϊ��Ա������Ա�����еĶ�����Ҳ������main������������
	Calendar cal; // Calendar Ϊ�����ࡣ
    public TestDate1(){
		/*date = new Date();//���췽�������ʼ��date����
		Date date2 = new Date();
System.out.println(date+"\n"+date.getDay()+"\n"+date.after(date2));//date��Ϊ��Ա����,����getDay������
	*/
    	//cal = new Calendar;//����CalendarΪ�����಻����new�Լ���
    	cal = Calendar.getInstance();//getInstance()Ϊstatic��̬����������ֱ�Ӵ����á�
    	System.out.println(cal+"\n"+cal.YEAR);//��̬�ı����ͷ����������������ú��ö�������ö���һ����Ч����
    	System.out.println(cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1));
    }          //get���Ǿ�̬�ģ����Ա����ö�������á�
    public static void main(String[] args) {
           
    TestDate1 obj = new TestDate1();//ֻ��ʹ��new�����������ù��췽����
	}

}

/*
 Mon Jan 11 18:48:53 CST 2016
1
false
 */
 