package com.tbkj;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        int n = 43;
        long before;
        int result;
        long after;

        before = System.currentTimeMillis();
        result = Fabonacci.bruteForceRecursion(n);
        after = System.currentTimeMillis();
        System.out.printf("Brute force: Result = %d Time = %d\n", result, after - before);

        before = System.currentTimeMillis();
        result = Fabonacci.dynamicProgrammingRecursion(n);
        after = System.currentTimeMillis();
        System.out.printf("Dynamic Programming: Result = %d Time = %d\n", result, after - before);

        before = System.currentTimeMillis();
        result = Fabonacci.iterative(n);
        after = System.currentTimeMillis();
        System.out.printf("Iterative: Result = %d Time = %d\n", result, after - before);

        before = System.currentTimeMillis();
        result = Fabonacci.directFormula(n);
        after = System.currentTimeMillis();
        System.out.printf("Direct Formula: Result = %d Time = %d\n", result, after - before);
    }
}
