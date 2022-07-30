package com.github.klubidorka;

/**
 * Hello world!
 *
 */
public class App {

    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }

        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
