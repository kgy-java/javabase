package com.designPattern.creationalPattern.factoryMethod.generalFactoryModel;

public class MyFactory {
	public MyInterface produce(String type) {
		if ("One".equals(type)) {
			return new MyClassOne();
		} else if ("Two".equals(type)) {
			return new MyClassTwo();
		} else {
			System.out.println("û��Ҫ�ҵ�����");
			return null;
		}
	}
}
