package com.nishthasoft.list;

import java.util.ArrayList;
import java.util.List;

// Underline Data structure is Resizable or growable Array
// Allows duplicate elements
// Insertion order is preserved
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();  // with defalut size 10 when you put 10th element x * 3/2 +1, x is your list size
                                        // so your size is 10 then (10 * 3/2) + 1 = 16. So all new list will be created
                                     // and all the elements get copied to new one that old list will be garbage collected.

        //ArrayList implements Random interface it does not contain any methods. It is marker interface which support fast
        // random access, any random element can be accessed in same speed. ArralyList not recommended for insertion
        // and deletion in middle
        List list = new ArrayList(30);
        List list1 = new ArrayList(list); // collection

        list.add("John");
        list.add(true);
        list.add(10);
        System.out.println(list);
        System.out.println(list.remove(true));
        System.out.println(list);


    }
}
