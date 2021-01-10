package com.cg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

    List<String> longnames = names.stream()    // converting the list to stream
            .filter(str -> str.length() > 6)   // filter the stream to create a new stream
            .collect(Collectors.toList()); 
    
    System.out.print("filter operation : ");
	 longnames.stream().forEach(y->System.out.print(y+" "));
   List<String> sortedname = names.stream().sorted().collect(Collectors.toList());
   
   System.out.println();
   
   System.out.print("sorted operation : ");
   sortedname.stream().forEach(y->System.out.print(y+" "));
   
   System.out.println();
   System.out.print("Map operations : ");
   List<Integer> numbers = Arrays.asList(1,2,5,6);
   numbers.stream().map(m->m*m).forEach(y->System.out.print(y+" "));
   
   System.out.println();
   List<Integer> num = Arrays.asList(2,5,6,7);
   int sum=num.stream().reduce((num1, num2) -> num1 + num2).get();
   System.out.println("Reduce Operation : "+sum);
}
}
