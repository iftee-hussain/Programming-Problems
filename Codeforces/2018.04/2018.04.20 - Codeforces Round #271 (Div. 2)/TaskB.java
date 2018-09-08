package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int worms [] = new int[n];
        int arr [] = new int[1000000+1];

        int sum = 0;
        int index =1;
        int count  = 0;
        for (int i = 0; i < n; i++) {
            worms[i] = in.nextInt();

             for(int j = 0; j<worms[i]; j++){
                arr[count] = index;
                count++;
            }
            index++;
        }



        int m = in.nextInt();
        int [] juicy_worms = new int[m];

        for (int i = 0; i <m ; i++) {
            juicy_worms[i] = in.nextInt();
        }


        for (int i = 0; i <m ; i++) {
            out.println(arr[juicy_worms[i]-1]);
        }

    }
}
