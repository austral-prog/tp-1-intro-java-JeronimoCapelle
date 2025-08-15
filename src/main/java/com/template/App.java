package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        return a+b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        return (number % 2 == 0);
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        return Math.max(a,b);
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        if (n==0){
            return 1;
        }
        return n * factorial(n-1);
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String buffer = "";
        for (int i = 0; i < input.length(); i++) {
            buffer = input.charAt(i) + buffer;
        }
        return buffer;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        for  (int i = number-1; i > 1; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int buffer = 999999;
        for (int j : array) {
            if (j < buffer) {
                buffer = j;
            }
        }
        return buffer;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int buffer = 0;
        for (int j : array) {
            buffer += j;
        }
        return buffer;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return celsius*9/5+32;
    }
}
