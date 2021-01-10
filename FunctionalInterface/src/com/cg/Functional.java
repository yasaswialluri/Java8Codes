package com.cg;
@FunctionalInterface
public interface Functional {

	void print();
	default void print1()
	{
		System.out.println("Hi");
	}
	static void print2()
	{
		System.out.println("Hello ");
	}
}
