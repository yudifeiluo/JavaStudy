//包用来组织类文件。在类的声明之前。
package com.Study28函数库组织包.pkg1;
import com.Study27接口.pkg1.Student;//导入另外一个包中的类文件。点相当于文件夹的分级。
                                   //可以用*表示所有类文件,可以导入多个包。
public class Father {
	public void print(){
		Student obj = new Student();//引用了另外一个包里的类文件。
		System.out.println("Father:println()");
	}

}
