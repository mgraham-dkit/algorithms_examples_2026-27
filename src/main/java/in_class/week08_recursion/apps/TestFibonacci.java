package in_class.week08_recursion.apps;



import in_class.week08_recursion.utils.RecursiveUtilities;

import java.util.Scanner;

public class TestFibonacci {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the index of the desired fibonacci value: ");
        int index = input.nextInt();
        int fib = RecursiveUtilities.fibonacci(index);
        System.out.println("Fibonacci of " + index + " = " + fib);
    }
}
