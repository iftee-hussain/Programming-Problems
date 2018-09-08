package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.LinkedList;
import java.util.Queue;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        int r = 1;
        while (r * 5 < n)
        {
            n -= r * 5;
            r *= 2;
        }

        String names[] = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        out.print(names[(n - 1) / r]);

        }

    }

