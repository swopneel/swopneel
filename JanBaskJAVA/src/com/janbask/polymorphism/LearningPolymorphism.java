package com.janbask.polymorphism;

public class LearningPolymorphism {
	
	//compile time polymorphism(method overloading)
	
	public void m1() {
		System.out.println("welcome");
	}
	public void m1(int x) {
		System.out.println("welcome");
	}
	public void m1(int x, int y) {
		System.out.println("welcome");
	}
	public void m1(String x) {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		LearningPolymorphism lp = new LearningPolymorphism();
		lp.m1();
		lp.m1(0);
		lp.m1(0, 0);
	}


}
