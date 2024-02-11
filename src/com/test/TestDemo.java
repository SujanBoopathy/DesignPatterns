package com.test;

class Test{
	private int status ;
	
	public void set(int l) {
		status = l;
	}
	public int get() {
		return status;
	}
	
	public void printStatus() {
		System.out.println(status);
	}
	
}
public class TestDemo {
	
	private int status;

	public TestDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int maxValue = Integer.MAX_VALUE;
	     System.out.println("Maximum value for int: " + maxValue);
	     Test test = new Test();
	     test(test);
	     System.out.print(test.get());;
	}
	
	public static void test(Test test) {
		test.set(11);
	}
}
