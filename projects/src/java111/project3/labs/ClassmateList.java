import java.util.*;
/**
 *  This class is for lab 7. It is used to practice using an ArrayList.
 *
 *  @author Nick Hanson
 *  - Created on: October 20, 2024
*/

public class ClassmateList {
    
    ArrayList<String> stringList;

    public void run() {
        stringList = new ArrayList<String>();

        stringList.add("Frodo Baggins");
        stringList.add("Samwise 'Sam' Gamgee");
        stringList.add("Bilbo Baggins");
        stringList.add("Meriadoc 'Merry' Brandybuck");
        stringList.add("Peregrin 'Pippen' Took");

        System.out.println();
        System.out.println();
        System.out.println("The Fellowship of the Ring Members:");
        System.out.println(stringList);

        System.out.println();
        System.out.println("Each member (Using a for loop):");
        for (int counter = 0; counter < stringList.size(); counter++) {
            System.out.println(stringList.get(counter));
        };

        System.out.println();

        int middleString = stringList.size() / 2;

        stringList.remove(middleString);

        System.out.println("The Fellowship of the Ring Members after Bilbo's exit:");
        System.out.println(stringList);

    }
}
