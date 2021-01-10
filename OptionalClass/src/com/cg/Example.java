package com.cg;

import java.util.Optional;

public class Example {
public static void main(String[] args) {
	
	
	String[] str = new String[10];  
	str[2] = "Geeks Classes are coming soon"; 
	  
    Optional<String> checkNull = Optional.ofNullable(str[5]);  
    if(checkNull.isPresent()){  // check for value is present or not  
        String lowercaseString = str[5].toLowerCase();  
        System.out.print(lowercaseString);  
    }else  
        System.out.println("string value is not present"); 
    
    Optional<String> empty = Optional.empty(); 
    System.out.println(empty); 

    Optional<String> value = Optional.of(str[2]); 
    System.out.println(value.get()); 
    
    System.out.println(value.isPresent()); 
}
}
