package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<arr.length ; ++i){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i<arr.length ; ++i){
            out.print(arr[i] + " ");
        }
    }
}
