import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class something {


    public static void main(String[] args) {
        //Write a Java program to find the first non-repeating character in a string.
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println("The given string is: " + word);

   /*     for (int i = 0; i < word.length(); i++) {
            boolean un = true;
            for (int j = 0; j < word.length(); j++) {
                if (i != j && word.charAt(i) == word.charAt(j)) {
                    un = false;
                    break;
                }
            }
            if (un) {
                System.out.println(word.charAt(i));
            }
        }*/

        //or
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] strArray = word.toCharArray();

        for (char c : strArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : strArray) {
            if (map.get(c) == 1) {
                System.out.println("Mon r : " + c );
                break;
            }
        }

        for (char c : strArray) {
            if (map.get(c) > 1) {
                System.out.println("r : " + c );
                break;
            }
        }


        //a string is given. find the most frequently encountered symbol.
        // if several characters occur equally often, output any

        char[] array = word.toCharArray();

        int index=1;
        int col=1;

        for (int i=0;i<array.length;i++){
            int colv=1;
            for (int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    colv++;
                }
            }
            if (colv>col){
                col=colv;
                index=i;
            }
        }
        System.out.println();
        System.out.println("Максимальное количество вхождений: " + array[index] + ":" + col);



        // Find the second largest maximum number

        int [] arr = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2 && arr[i] != min) {
                min2 = arr[i];
            }
        }

        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Второй по минимальности элемент в массиве: " + min2);
        } else {
            System.out.println("Второго по минимальности элемента нет");
        }

        System.out.println("Минимальный элемент в массиве: " + min);



        // Write a Java program to get a character at the specified index in a string.
        
        String str ="Java Exercises!";
        System.out.println("Original String =" + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);
        // Print out the results.
        System.out.println("The character at position 0 is " +
                (char)index1);
        System.out.println("The character at position 10 is " +
                (char)index2);
        
        
        
        // Write a Java program to get a character (Unicode code point) at the specified index in the string.
        
        String str ="w3resource.com";
        System.out.println("Original String : " + str);
        
        // codepoint at index 1
        int val1 = str.codePointAt(1);
    
        // codepoint at index 9
        int val2 = str.codePointAt(9);
        
        // prints character at index1 in string
        System.out.println("Character(unicode point) =" + val1);
        // prints character at index9 in string
        System.out.println("Character(unicode point) =" + val2);
        
        
        
        
        // Write a Java program to count the number of Unicode code points in the specified text range of the string.
        
        String str ="w3rsource.com";
        System.out.println("Original String : " + str);
        
        // codepoint from index 1 to index 10
        int ctr = str.codePointCount(1, 10);
        
        // prints character from index 1 to index 10
        System.out.println("Codepoint count =" + ctr);
    }
}
