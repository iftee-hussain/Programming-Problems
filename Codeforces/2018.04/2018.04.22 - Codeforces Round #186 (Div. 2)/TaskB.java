package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TaskB {
    static class Pair{
        int a ,b;
        Pair(int a, int b ){
            this.a = a ;
            this.b = b;
        }
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n =in.nextInt();
        int[] data = new int[n];


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < data.length; i++) {
            data[i] = in.nextInt();
            min = Math.min(min, data[i]);
            max = Math.max(max, data[i]);
        }

        int minCount = 0;
        int maxCount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == min)
                minCount++;
            if (data[i] == max)
                maxCount++;
        }

        long result = 0;
        if (max == min)
            result = n * 1L * (n - 1) / 2;
        else
            result = minCount * 1L * maxCount;

        out.println((max - min) + " " + result);
    }
}
