package com.janbask.abstraction;

abstract public class Sample {
public abstract void mOne();

public void mTwo() {
	System.out.println("m2 method....");
}

class Demo extends Sample{
	public void mOne() {
		
	}
}
class Test {
	public static void main (String[] args) {
		//Demo d = new Demo();
	}
}
}
