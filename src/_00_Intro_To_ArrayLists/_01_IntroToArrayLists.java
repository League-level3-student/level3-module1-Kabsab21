package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	 ArrayList<String> words = new ArrayList<String>();
        // 2. Add five Strings to your list
words.add("cooleo word");
words.add("even more rad word");
words.add("a word so sickeningly sick");
words.add("cowabunga!");
words.add(" i miss my wife and kids");
        // 3. Print all the Strings using a standard for-loop
for( int i = 0; i < words.size(); i++) {
	System.out.println(words.get(i));
}
        // 4. Print all the Strings using a for-each loop
System.out.println( "NEW LOOP");
for( String i : words) {
	System.out.println(i);
}
System.out.println( "NEW LOOP");
        // 5. Print only the even numbered elements in the list.
for( int i = 0; i < words.size(); i++) {
	if( i%2 == 0) {
	System.out.println(words.get(i));

	}
}
System.out.println( "NEW LOOP");
        // 6. Print all the Strings in reverse order.
for( int i = words.size()-1; i >=0 ; i--) {
	System.out.println(words.get(i));
}
        // 7. Print only the Strings that have the letter 'e' in them.
System.out.println( "NEW LOOP");
    for( String i : words) {
String e = "e";
    	if(i.contains(e) ==  true) {
    		System.out.println(i);
    	}
  	
    }
    
    
   }
}
    

