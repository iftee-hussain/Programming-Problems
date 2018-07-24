package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String arr [] = new String[n];
        int count = 1;
        for (int i = 0;i<n ;i++){
            arr[i] = in.nextString();
        }
        for (int j = 0;j<n-1 ;j++){
           if(!arr[j].equals(arr[j+1]))
               count++;
        }
        out.print(count);
    }

}
