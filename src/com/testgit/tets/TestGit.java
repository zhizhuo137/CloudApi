package com.testgit.tets;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestGit {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("testdGit");
		System.out.println("commitLocal11");
		Map map = new HashMap(1000);
		Class<?> mapType = map.getClass();
		Method capacity = mapType.getDeclaredMethod("capacity");
		capacity.setAccessible(true);
		System.out.println("capacity : " + capacity.invoke(map));
		map.put("2222", 22222);
		mapType = map.getClass();
		capacity = mapType.getDeclaredMethod("capacity");
		System.out.println("capacity : " + capacity.invoke(map));
	}

}
