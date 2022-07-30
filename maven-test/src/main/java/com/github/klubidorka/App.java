package com.github.klubidorka;

/**
 * Hello world!
 *
 */
public class App {

    /** f[1] = 1
     *  f[2] = 1
     *  f[n] = f[n-1] + f[n-2]
     *  1 1 2 3 5 8 13 ...
     */
    public static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n > 100) {
            throw new IllegalArgumentException("n too big");
        }

        int arr[] = new int[Math.max(n, 2)];
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
