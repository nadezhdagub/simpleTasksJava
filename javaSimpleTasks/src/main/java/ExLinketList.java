import java.util.*;

public class ExLinketList {
    public static void main(String[] args) {
        //Write a Java program to add the specified item to the end of the linked list.
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("Red");
        lList.add("Green");
        lList.add("Blue");
        lList.add("Yellow");
        lList.add("Black");
        lList.add("Pink");
        System.out.println("The linked list: " + lList);

        //Write a Java program to iterate through all the items in the linked list.
        for (String e : lList) {
            System.out.println(e);
        }

        //Write a Java program to iterate through all the elements
        // in the linked list, starting from the specified position.
        Iterator p = lList.listIterator(1);
        while (p.hasNext()) {
            System.out.println(p.next());
        }

        //Write a Java program to iterate the linked list in reverse order.
        Iterator it = lList.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Write a Java program to insert the specified element
        // into the specified position in the linked list.
        lList.add(1, "White");
        System.out.println("The linked list: " + lList);

        //Write a Java program to insert items into the linked list in the first and last position.
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        l_list.addFirst("Brown");
        l_list.addLast("Orange");
        System.out.println("Final linked list:" + l_list);

        //Write a Java program to insert the specified element at the beginning of the linked list.
        l_list.offerFirst("Pink");
        System.out.println("Final linked list:" + l_list);

        //Write a Java program to insert the specified element at the end of the linked list.
        l_list.offerLast("Pink");
        System.out.println("Final linked list:" + l_list);

        //Write a Java program to insert some elements in the specified position into the linked list.
        LinkedList <String> l_l = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_l.add("Red");
        l_l.add("Green");
        l_l.add("Black");
        // print original list
        System.out.println("Original linked list:" + l_l);
        // create a new collection and add some elements
        LinkedList <String> new_l_l = new LinkedList <String> ();
        new_l_l.add("White");
        new_l_l.add("Pink");
        // Add the collection in the second position of the existing linked list
        l_l.addAll(1, new_l_l);
        // print the new list
        System.out.println("LinkedList:" + l_l);

        //Write a Java program to get the first and last occurrence of the specified items in the linked list.
        Object first_element = l_list.getFirst();
        System.out.println("First Element is: "+first_element);
        // Find last element of the List
        Object last_element = l_list.getLast();
        System.out.println("Last Element is: "+last_element);

        //Write a Java program to display items and their positions in a linked list.
        for(int pp=0; pp < l_list.size(); pp++) {
            System.out.println("Element at index "+pp+": "+l_list.get(pp));
        }

        //Write a Java program to remove the specified item from the linked list.
        l_list.remove(2);
        System.out.println("The New linked list: " + l_list);

        //Write a Java program to remove the first and last item from the linked list.
        Object firstElement = l_list.removeFirst();
        System.out.println("Element removed: "+ firstElement);
        Object lastElement = l_list.removeLast();
        System.out.println("Element removed: "+ lastElement);
        System.out.println("The New linked list: " + l_list);

        //Write a Java program to remove all items from the linked list.
        l_list.clear();
        System.out.println("The New linked list: " + l_list);

        //Write a Java program that will swap two items in a linked list.
        LinkedList <String> llist = new LinkedList <String> ();
        llist.add("Red");
        llist.add("Green");
        llist.add("Black");
        llist.add("Pink");
        llist.add("orange");
        System.out.println("The Original linked list: " + llist);

        Collections.swap(llist, 0, 2);
        System.out.println("The New linked list after swap: " + llist);

        //Write a Java program to combine two linked lists.
        LinkedList <String> c1 = new LinkedList <String> ();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first linked list: " + c1);
        LinkedList <String> c2 = new LinkedList <String> ();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second linked list: " + c2);

        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list: " + a);

        //Write a Java program to clone a linked list into another linked list.
        LinkedList <String> c3 = new LinkedList<String>();
        c3.add("Red");
        c3.add("Green");
        c3.add("Black");
        c3.add("White");
        c3.add("Pink");
        System.out.println("Original linked  list: " + c3);
        LinkedList <String> newc1 = new LinkedList<String>();
        newc1 = (LinkedList)c1.clone();
        System.out.println("Cloned linked list: " + newc1);

        //Write a Java program to delete and return the first element of the linked list.
        LinkedList <String> c4 = new LinkedList <String> ();
        c4.add("Red");
        c4.add("Green");
        c4.add("Black");
        c4.add("White");
        c4.add("Pink");
        System.out.println("Original linked  list: " + c4);
        System.out.println("Removed element: "+c4.pop());
        System.out.println("Linked list after pop operation: "+c4);

        //Write a Java program to extract, but not delete, the first element of the linked list.
        LinkedList <String> c5 = new LinkedList <String> ();
        c5.add("Red");
        c5.add("Green");
        c5.add("Black");
        c5.add("White");
        c5.add("Pink");
        System.out.println("Original linked list: " + c5);
        String x = c5.peekFirst();
        System.out.println("First element in the list: " + x);
        System.out.println("Original linked list: " + c5);

        //Write a Java program to extract, but not delete, the last element of the linked list
        String xx = c5.peekLast();
        System.out.println("Last element in the list: " + xx);
        System.out.println("Original linked list: " + c5);

        //Write a Java program to check if a certain item exists in the linked list.
        if (c5.contains("Green")) {
            System.out.println("Color Green is present in the linked list.");
        } else {
            System.out.println("Color Green is not present in the linked list.");
        }

        //Write a Java program to convert a linked list to a list of arrays.
        List<String> list = new ArrayList<String>(c5);
        for (String str : list) {
            System.out.println(str);
        }

        //Write a Java program to compare two linked lists.
        LinkedList<String> c6= new LinkedList<String>();
        c6.add("Red");
        c6.add("Green");
        c6.add("Black");
        c6.add("White");
        c6.add("Pink");
        LinkedList<String> c7= new LinkedList<String>();
        c7.add("Red");
        c7.add("Green");
        c7.add("Black");
        c7.add("Orange");
        //comparison output in linked list
        LinkedList<String> c8 = new LinkedList<String>();
        for (String e : c6)
            c8.add(c7.contains(e) ? "Yes" : "No");
        System.out.println(c8);

        //Write a Java program to test the linked list empty or not.
        LinkedList<String> la= new LinkedList<String>();
        la.add("Red");
        la.add("Green");
        la.add("Black");
        la.add("White");
        la.add("Pink");
        System.out.println("Original linked list: " + la);
        System.out.println("Check the above linked list is empty or not! "+la.isEmpty());
        la.removeAll(la);
        System.out.println("Linked list after remove all elements "+la);
        System.out.println("Check the above linked list is empty or not! "+la.isEmpty());

        //Write a Java program to replace an item in a linked list.
        la.set(1, "Orange");
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + la);
    }
}
