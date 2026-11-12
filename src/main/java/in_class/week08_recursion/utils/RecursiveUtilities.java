package in_class.week08_recursion.utils;

public class RecursiveUtilities {
    public static int fibonacci(int index){
        System.out.println("Now calculating fibonacci(" + index + ")");
        // Validation base case
        if(index < 0){
            throw new IllegalArgumentException("Illegal index requested - Fibonacci sequence begins at 1");
        }

        // Calculation base case 1 - where requested value is 0th in sequence
        if(index == 0){
            return 0;
        }

        // Calculation base case 2 - where requested value is 1st or 2nd in sequence
        if(index == 1 || index == 2){
            return 1;
        }

        // Recursive case -> reduce value being calculated and combine results
        return fibonacci(index-1) + fibonacci(index-2);
    }

    public static int sum(int [] data){
        return sum(data, 0);
    }

    public static int sum(int [] data, int index){
        // Validation base case
        if(index < 0 || index >= data.length){
            throw new IllegalArgumentException("Index must be within range of data");
        }

        // Calculation base case -> where we have reached the end of the array, start the calculation
        if(index == data.length - 1){
            return data[index];
        }

        // Recursive case -> reduce the data to be worked on and combine its result with current value
        return data[index] + sum(data, index+1);
    }
}
