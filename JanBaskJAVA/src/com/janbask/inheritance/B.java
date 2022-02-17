package com.janbask.inheritance;

public class B extends A {

	public static void main(String[] args) {
		B b = new B();
		b.m2();
	}

	public void m2() {
		System.out.println("m2 method of class B");
	}

	public void m3() {
		System.out.println("m3 method of class B");
	}

}
