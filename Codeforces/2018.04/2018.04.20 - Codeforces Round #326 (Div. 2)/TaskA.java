package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int arr [] = new int[n];
        int price [] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
            price[i] = in.nextInt();
        }

        int sum = arr[0] * price[0];

        int min = price[0];

        for(int i = 1; i<n; i++){
           if(min>price[i]){
               min = price[i];
           }
           sum += min * arr[i];


        }

        out.print(sum);

    }
}
