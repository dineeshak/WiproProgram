package DAY5;

import java.util.Arrays;

interface EmployeeNameSorter {
    void sortEmployeeNames(String[] employeeNames);
}

class EmployeeSort implements EmployeeNameSorter {
    public void sortEmployeeNames(String[] employeeNames) {
        Arrays.sort(employeeNames);
        System.out.println("Sorted employee names:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}

public class SortNamesDemo {
    public static void main(String[] args) {
        String[] employeeNames = {"Zara", "Alice", "Bob", "Charlie"};

        EmployeeNameSorter sorter = new EmployeeSort();
        sorter.sortEmployeeNames(employeeNames);
    }
}
