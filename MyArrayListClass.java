/*
ArrayList Class
part of a collection framework in java.util package 
provides use with dynamic arrays that can be manipulated 
Pros 
-do not need to specify the size when creating its object
cons
-speed relative to standard arrays
-only supports objects entries and can not be used for primitive types, like int, char, etc. (wrapper)
*/


import java.util.ArrayList;

public class MyArrayListClass { 
  public static void main(String[] args) { 
    //declaring  array
    ArrayList<String> lunch = new ArrayList<String> (2);

    
    lunch.add("fajitas");
    lunch.add("mangu");
    lunch.add("pizza");
    lunch.add("Mexican Wrap");
    lunch.add("cheeseburger");
   
    System.out.println(lunch);

    //***methods in ArrayList class**
    //get method
    System.out.println(lunch.get(1));
   
    //remove method
    //lunch.remove(4);
   
   
    //clear method clears arraylist elements
    //lunch.clear();
  
    //set method
    lunch.set(4, "salad");
   
    //size method
    
    System.out.println(lunch.contains("salad"));
  
    //clear method clears arraylist elements
    //lunch.clear();
    //Example 
    if ( lunch.get(2).equals("pizza")){
    System.out.println(" We are having pizza today! :P");
    }
  } 
}

