package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt(), k = in.nextInt();
        int arr []  = in.nextIntArray(n);

        int min = Integer.MAX_VALUE;
        int index = 0 ;
        for (int i = 0; i <= n-k; i++) {
            int sum = 0;
            for (int j = i+0; j < i+k; j++) {
                sum += arr[j];
            }

            if(sum < min){
                min = sum;
                index = i+1;
            }
        }

        out.print(index);


    }
}
