package com.Study29API.pkg1;
import java.util.Scanner;//导入Scanner类。学会使用API文档。
public class TestScanner1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//在 java.util 包中，需导入。
		                            //System.in 指键盘。
        System.out.println("请输入任意字符串：");
        System.out.println("用户输入的字符串是："+scanner.next());
	}

}

/*请输入任意字符串：
hello
用户输入的字符串是：hello*/