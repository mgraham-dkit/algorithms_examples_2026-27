package d_recursion.apps;

import d_recursion.utils.RecursiveUtils;

public class TestRecursiveFactorial {
    static void main(String[] args) {
        int factorial = RecursiveUtils.factorial(5);

        System.out.println("Factorial of 5: " + factorial);
    }
}
