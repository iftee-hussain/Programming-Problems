package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int n = in.nextInt();
        int k = in.nextInt();

        int arr [] = new int[n];
        int c = 0 ;
        for(int i =0 ;i<n ; i++) {
            arr[i] = in.nextInt();
            if( 5 - arr[i] >=k)
                c++;
        }
        out.print(c/3);



    }
}
