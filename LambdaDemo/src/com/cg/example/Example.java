package com.cg.example;

public class Example {
public static void main(String[] args) {
	 int width=10;  
	  
     
     Drawable d=new Drawable(){  
         public void sketch(){System.out.println("Drawing "+width);}  
     };  
     d.sketch();  
}
}
