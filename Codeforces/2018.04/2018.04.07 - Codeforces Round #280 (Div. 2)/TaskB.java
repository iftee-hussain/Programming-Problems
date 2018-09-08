package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.text.DecimalFormat;
import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int l = in.nextInt();

        int arr [] = new int[n];

        for (int i = 0 ; i<n ;i++)
            arr[i] = in.nextInt();

        Arrays.sort(arr);

        double r = Math.max(arr[0], l-arr[n-1]) * 2.0;
        //out.println(r);
        for (int i = 0 ; i<n-1 ;i++){
            r = Math.max(r, (double)(arr[i+1] - arr[i]));
        }
        out.print( new DecimalFormat("0.0000000000").format(r/2.0));

       //out.print(String.format("%.10f", (float)(r/2.0f)));


    }
}
