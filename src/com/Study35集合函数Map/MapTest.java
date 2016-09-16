package com.Study35集合函数Map;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();//不带参数，初始容量16。键值对的方式存储。
        map.put("s001", "aaa");//key与value都是对象，用对象来索引对象。
        map.put("s001", "bbb");
        System.out.println(map.size());//长度为1，前面值被覆盖。
        System.out.println(map.get("s001"));//通过key来获取key所对应的value的值。
	}

}
