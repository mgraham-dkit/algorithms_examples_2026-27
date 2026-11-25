package solutions.week08_and_10_recursion.apps;

import solutions.week08_and_10_recursion.utils.RecursiveUtils;

public class TestRecursion {

    static void main(String[] args) {
        System.out.println("100 = " + RecursiveUtils.fibonacci(100));
        String text = "XYXYXYXY";
        char letter = 'X';
        System.out.println(letter + " appears " + RecursiveUtils.count(text, letter, 0) + " times in "  +text);
        System.out.println(RecursiveUtils.sumDigits(-12345));
        System.out.println("Reversing Hello: " + RecursiveUtils.reverse("Hello"));
        int [] data = {1, 2, 3, 4, 5};
        System.out.println("Sum of values in an array: " + RecursiveUtils.sum(data));

        System.out.println("Reversing using char array: " + RecursiveUtils.reversingString("Hello"));
    }
}
