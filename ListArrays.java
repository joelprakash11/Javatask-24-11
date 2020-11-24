package com.tls.wrapperclass;

import java.util.ArrayList;

public class ListArrays {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list=new ArrayList();
		list.add(1);
		list.add("Welcome");
		list.add(10);
		list.add(2);
		list.add(4.3);
		list.add("we are the array list");
		System.out.println(list);
		list.remove(2);
		list.add(2, "this is joel");
		System.out.println(list);
		list.remove(4.3);
		System.out.println(list);

	}

}
