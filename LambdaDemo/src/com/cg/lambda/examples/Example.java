package com.cg.lambda.examples;

public class Example {
public static void main(String[] args) {
	
	//No parameter
//	Print p = () -> { return "Hello Team";};
//	System.out.println(p.print());
	
	//with one parameter	
//	Print p = (name) -> { return "Hello "+name;};
//	System.out.println(p.print("yasaswi"));
	
	// with two parameters and without data type
	Print p1=(a,b) -> {return a+b;};
	System.out.println(p1.add(10, 20));
	
	//with two parameters and with data type
	
	Print p2 =(int a,int b)->{return a+b;};
	System.out.println(p2.add(10, 40));
	
	//without return type
	Print p3 = (a,b)->(a+b);
	System.out.println(p3.add(20, 30));
	
	Print p4 =(a,b)->{return a+b;};
	System.out.println(p4.add(60, 70));

}
}
