package com.cg;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Example1 {
public static void main(String[] args) {
	 Consumer<Integer> display = a -> System.out.println("consumer "+a); 
     display.accept(10); 
     BiConsumer<Integer, Integer> display2 = (a,b)->System.out.println("BiConsumer "+(a+b));
     display2.accept(10,20);
     Supplier<String> supplier= ()-> "Yasaswi";
     supplier.get();
     Predicate<Integer> lesserthan = i -> (i < 18);  
     System.out.println("predicate "+(lesserthan.test(10)));  
     BiPredicate<String, Integer> filter = (x, y) -> {
         return x.length() == y;
     };
     boolean result2 = filter.test("java", 10);
     System.out.println("BiPredicate "+result2);
     Function<Integer, Double> half = a -> a / 2.0; 
     System.out.println("function "+half.apply(10));  
     BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
     Integer result = func.apply(2, 3);
     System.out.println("BiFunction "+result); 
}
}
