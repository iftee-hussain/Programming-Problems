package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int arr [] = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = 0, max_index = 0;

        for(int i =0; i<n; ++i){
            arr[i] = in.nextInt();

        }

        for(int i =0; i<n; ++i){
            if(arr[i] > max){
                max = arr[i];
                max_index = i;
            }

            if(arr[i] <= min){
                min = arr[i];
                min_index = i;
            }

        }
        out.print(max_index + (n-1-min_index) - (min_index <max_index?1:0));




    }
}
