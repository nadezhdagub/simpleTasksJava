import java.util.Iterator;
import java.util.LinkedList;

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

        //
        
    }
}
