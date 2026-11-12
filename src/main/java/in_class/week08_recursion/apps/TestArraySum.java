package in_class.week08_recursion.apps;

import in_class.week08_recursion.utils.RecursiveUtilities;

public class TestArraySum {
    static void main(String[] args) {
        int [] data = {1, 2, 3, 4, 5};

        int sum = RecursiveUtilities.sum(data, 0);
        System.out.println("sum of data: " + sum);
    }
}
