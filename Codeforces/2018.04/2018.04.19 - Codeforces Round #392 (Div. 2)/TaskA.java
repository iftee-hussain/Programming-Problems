package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();

        int arr [] = new int[n];

        for(int i = 0; i< n;i++)
            arr[i] = in.nextInt();

        Arrays.sort(arr);
        int sum = 0;

        for(int i = 0; i< n;i++)
            sum+= arr[n-1] - arr[i];

        out.print(sum);


    }
}
