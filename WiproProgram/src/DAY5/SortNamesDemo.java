package DAY5;

import java.util.Arrays;

interface NameSorter {
 void sortNames(String[] names);
}

class NameSort implements NameSorter {
 public void sortNames(String[] names) {
     Arrays.sort(names);
     System.out.println("Sorted names:");
     for (String name : names) {
         System.out.println(name);
     }
 }
}

public class SortNamesDemo {
 public static void main(String[] args) {
     String[] names = {"Zara", "Alice", "Bob", "Charlie"};

     NameSorter sorter = new NameSort();
     sorter.sortNames(names);
 }
}
