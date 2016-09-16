package com.Study34集合函数Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class SetTest {

	public static void main(String[] args) {
		//TreeSet可以根据元素的自然顺序进行排序。
		//TreeSet set = new  TreeSet();
		//两种Set的底层数据结构不同，一种是二叉树，一种是哈希表。
		HashSet set = new HashSet();
		set.add(10);
		set.add(7);
		set.add(1);
		//迭代集合，Iterator接口迭代器将Set集合转换成一个迭代对象。
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
        	Object obj = iterator.next();
        	System.out.println(obj);
        }
	}

}
