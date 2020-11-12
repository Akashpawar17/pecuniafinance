package com.ocja;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("akash");
		l.add("durgaa");
		l.add("pawarakash");
		System.out.println(l);
		l.forEach(
				(i)->System.out.println(i)
				);
	}

}
