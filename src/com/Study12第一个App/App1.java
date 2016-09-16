package com.Study12第一个App;
/*输入10位学生的成绩，并判定他们的成绩属于哪一个等级。90——100 A级。80——89 B级。 
 * 70——79 C级。 60——69 D级。 60以下为E级。*/
import java.util.Scanner;
public class App1 {
	public static void main(String[] args) {
		double[] Scores = new double[10];
		Scanner s = new Scanner(System.in);
		//读取keyboard input 并且 give it to scores数组元素。
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("请输入第"+i+"位学生的成绩：");
			Scores[i] = s.nextDouble();
		}
		for(int j = 0 ; j < 10 ; j++){
			double temp = Scores[j];
			if(temp >= 90 && temp <= 100){
				System.out.println("第"+j+"位学生的成绩等级是A");
			}else if(temp >= 80 && temp <= 89){
				System.out.println("第"+j+"位学生的成绩等级是B");
			}else if(temp >= 70 && temp <= 79 ){
				System.out.println("第"+j+"位学生的成绩等级是C");
			}else if(temp >= 60 && temp <= 69){
				System.out.println("第"+j+"位学生的成绩等级是D");
			}else if(temp <= 59){
				System.out.println("第"+j+"位学生的成绩等级是E");
			}
			}
		}
	}


