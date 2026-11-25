package solutions.week08_and_10_recursion.utils;

import java.util.HashMap;

public class RecursiveUtils {
    private static final HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public static int fibonacci(int n){
        if(n < 0){
            throw new IllegalArgumentException("Fibonacci numbers must be >= 0");
        }

        if(n <= 1){
            return n;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }

        int fib = fibonacci(n-2) + fibonacci(n-1);
        cache.put(n, fib);
        return fib;
    }

    public static int factorial(int num){
        if(num <= 1){
            return 1;
        }
        int factorial =  factorial(num-1);
        return num * factorial;
    }

    public static int sum(int [] data){
        return sum(data, 0);
    }

    public static int sum(int [] data, int startPos){
        if(startPos == data.length-1){
            return data[startPos];
        }

        return data[startPos] + sum(data, startPos+1);
    }

    public static int sumDigits(int num){
        if(num < 0){
            num = num * -1;
        }

        if(num < 10){
            System.out.println("Returning " + num);
            return num;
        }

        int digit = num % 10;
        System.out.println("Current number: " + num);
        System.out.println("Current final digit: " + digit);
        return digit + sumDigits(Math.floorDiv(num, 10));
    }

    // Wrapper method for calculating count - will always start at the start of the text
    public static int count(String text, char letter){
        return count(text, letter, 0);
    }

    // Sample solution to count number of appearances of a character
    public static int count(String text, char letter, int startPos){
        int count = 0;
        if(text.charAt(startPos) == letter){
            count = 1;
        }
        if(startPos == text.length() - 1){
            return count;
        }

        return count + count(text, letter, startPos+1);
    }

    // Sample solution to reverse a string
    public static String reverse(String input){
        if(input.isBlank()){
            return input;
        }
        if(input.length() == 1){
            return input;
        }
        System.out.println("Now working on " + input.substring(1));
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static String reversingString(String input){
        if(input.isBlank()){
            return input;
        }
        if(input.length() == 1){
            return input;
        }

        char [] characters = input.toCharArray();

        return reverseAsCharArray(characters, 0);
    }

    private static String reverseAsCharArray(char [] input, int startIndex){
        if (input == null) {
            throw new IllegalArgumentException("Cannot reverse a null array");
        }

        if(startIndex < 0 || startIndex > input.length){
            throw new IndexOutOfBoundsException("Cannot reverse data outside boundaries of an array");
        }

        if(startIndex == input.length){
            return "";
        }

        return reverseAsCharArray(input, startIndex+1) + input[startIndex];
    }

    public static int binarySearch(int [] data, int target) {
        if (data == null) {
            throw new IllegalArgumentException("Cannot search a null array");
        }

        int start = 0;
        int end = data.length - 1;

        return binarySearch(data, target, start, end);
    }

    private static int binarySearch(int [] data, int target, int start, int end){
        if (start <= end){
            int mid = start + (end - start) / 2;
            if(data[mid] == target){
                return mid;
            }else if(data[mid] > target){
                end = mid - 1;
                return binarySearch(data, target, start, end);
            }else{
                start = mid + 1;
                return binarySearch(data, target, start, end);
            }
        }
        return -1;
    }
}
