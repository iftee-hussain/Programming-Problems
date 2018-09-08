package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int arr [] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int count = 1;

        for (int i = 0; i < n-1; i++) {
            if(arr[i+1] - arr[i] <= m)
                count++;
            else
                count = 1;

        }
        if(n ==1)
            out.print(1);
        else
            out.print(count);
    }
}
