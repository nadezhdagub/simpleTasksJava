import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExArrayList {
    public static void main(String[] args) {
        // Write a Java program to create a new list of arrays,
        // add some elements (strings) and print the collection.
        List<String> list = new ArrayList<String>();
        list.add("RED");
        list.add("GREEN");
        list.add("Orange");
        list.add("White");
        System.out.println(list);

        //Write a Java program to iterate
        // through all the elements in the array list.
        for(String e : list) {
            System.out.println(e);
        }

        //Write a Java program to insert an element into the list of arrays in the first position
        list.add(0, "Pink");
        System.out.println(list);

        //Write a Java program to extract an element (at the specified index) from a given list of arrays.
        String element = list.get(2);
        System.out.println(element);

        //Write a Java program to update a specific array element by a given element.
        list.set(3, "Yellow");
        System.out.println(list);

        //Write a Java program to remove the third element from the array list.
        list.remove(2);
        System.out.println("After removing third element from the list:\n" + list);

        //Write a Java program to search for an element in a list of arrays.
        if (list.contains("Orange")) {
            System.out.println("Okey");
        } else {
            System.out.println("There is no suh element");
        }

        //Write a Java program to sort a given list of arrays.
        Collections.sort(list);
        System.out.println("list after sort: " + list);

        //Write a Java program to copy one array list to another.
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        System.out.println("List1: " + list1);

        List<String> list2 = new ArrayList<String>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        System.out.println("List2: " + list2);

        Collections.copy(list1, list2); // Copy List2 to List1, so list1 and list2 are the same
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        //Write a Java program to shuffle elements in a list of arrays.
        Collections.shuffle(list);
        System.out.println("List after shuffling:\n" + list);

        //Write a Java program to address the elements in the array list.
        Collections.reverse(list);
        System.out.println("List after reversing :\n" + list);

        //Write a Java program to extract a part of the array list.
        List<String> sub_list = list.subList(0, 3);
        System.out.println("List of first three elements: " + sub_list);

        //Write a Java program to compare two lists of arrays.
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<String>();
        for (String el : c1) {
            c3.add(c2.contains(el) ? "Yes" : "No");
            System.out.println(c3);
        }

        //Write a Java program that will change two elements in the array list.
        Collections.swap(list, 0, 2);
        System.out.println("Array list after swap:");
        for (String l : list) {
            System.out.println(l);
        }

        //Write a Java program to combine two lists of arrays.
        ArrayList<String> c4= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);

        ArrayList<String> c5= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second array: " + c2);

        ArrayList<String> c6 = new ArrayList<String>();
        c6.addAll(c4);
        c6.addAll(c5);
        System.out.println("New array: " + c6);

        //Write a Java program to clone a list of arrays into another list of arrays.
        ArrayList<String> new1 = (ArrayList<String>) c1.clone();
        System.out.println("Clone array list: " + new1);

        //Write a Java program to clear the array list.
        c6.removeAll(c6);
        System.out.println("Array list after remove all elements " + c6);

        //Write a Java program to check the list of arrays is empty or not.
        c6.removeAll(c6);
        System.out.println("Checking the above array list is empty or not! "+c6.isEmpty());

        //Write a Java program to reduce the capacity of the array list by the current size of the list.
        c5.trimToSize();
        System.out.println(c5);

        //Write a Java program to increase the size of the array list.
        ArrayList<String> ll= new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + ll);

        ll.ensureCapacity(6);
        ll.add("A");
        ll.add("B");
        ll.add("C");
        System.out.println("New array list: " + ll);

        //Write a Java program to replace the second ArrayList element with the specified element.
        ArrayList<String>  color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        System.out.println("Original array list: " + color);
        String new_color ="White";
        color.set(1,new_color);
        System.out.println("Replace second element with 'White'." + color);

        //Write a Java program to print all the elements of
        // the ArrayList using the arrangement of the elements.
        for (int index = 0; index < ll.size(); index++) {
            System.out.println(c1.get(index));
        }
    }
}
