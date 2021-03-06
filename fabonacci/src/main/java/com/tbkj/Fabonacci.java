package com.tbkj;

import java.util.HashMap;
import java.util.Map;

public class Fabonacci {
    public static int iterative(int N) {
        int first = 0;
        int second = 1;
        int third = first + second;

        if (N == 1)
            return first;

        if (N == 2)
            return second;

        if (N == 3)
            return third;

        for (int i = 2; i <= N; ++i) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }

    public static int bruteForceRecursion(int N) {
        return bruteForceRecursionHelper(N);
    }

    private static int bruteForceRecursionHelper(int N) {
        if (N <= 1) {
            return N;
        }

        return bruteForceRecursionHelper(N - 1) + bruteForceRecursionHelper(N - 2);
    }

    public static int dynamicProgrammingRecursion(int N) {
        return dynamicProgrammingRecursionHelper(N, new HashMap<>());
    }

    private static int dynamicProgrammingRecursionHelper(int N, Map<Integer, Integer> map) {
        if (N <= 1)
            return N;

        int first = 0;
        if (!map.containsKey(N - 1)) {
            int num = dynamicProgrammingRecursionHelper(N - 1, map);
            map.put(N - 1, num);
        }
        first = map.get(N - 1);

        int second = 0;
        if (!map.containsKey(N - 2)) {
            int num = dynamicProgrammingRecursionHelper(N - 2, map);
            map.put(N - 2, num);
        }
        second = map.get(N - 2);

        return first + second;
    }

    public static int directFormula(int N) {
        double sqrtOfFive = Math.sqrt(5);
        
        double temp = ((sqrtOfFive + 1) / 2);
        int num = (int)(Math.round((Math.pow(temp, N)) / sqrtOfFive));

        return num;
    }
}
