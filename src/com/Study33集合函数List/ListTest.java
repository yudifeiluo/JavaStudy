package com.Study33集合函数List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();//初始容量为10的空列表。
        //LinkeList为链接列表的实现。ArrayList为可变数组的实现。
		//LinkedList alist = new LinkedList();
		//初始向量为（1,1）
		//Vector alist = new Vector(1,1);
		
		alist.add(10);//Object类型即为任意类型。
        alist.add("hello");
        //遍历序列的元素。
        int size = alist.size();//返回列表中的元素数。
        
        for(int i=0;i<size;i++){
        	System.out.println(alist.get(i));
        }
        
	}

}
