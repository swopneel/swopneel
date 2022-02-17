package com.janbask.abstraction;

public abstract class C1 {
	void m1() {
		System.out.println("C1 class m1..");
	}
	abstract void m2();
	
}

class C2 extends C1{
	void m2() {
		System.out.println("C2 class m2");
	}
	void m3() {
		System.out.println("C2 class m3");
	}
}

class Test{
	public static void main(String [] args) {
		/*
		 * C2 c = new C1(); c.m1(); c.m2(); c.m3();
		 */
	}
}
