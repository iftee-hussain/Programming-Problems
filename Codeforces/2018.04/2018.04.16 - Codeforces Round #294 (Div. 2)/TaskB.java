package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n, t;
         n = in.nextInt();
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < n; i++)
        {
             t = in.nextInt();
            a += t;
        }

        for (int i = 0; i < n - 1; i++)
        {
             t = in.nextInt();
            b += t;
        }

        for (int i = 0; i < n - 2; i++)
        {
            t =in.nextInt();
            c += t;
        }
        out.println(a-b);
        out.println(b-c);
    }
}
