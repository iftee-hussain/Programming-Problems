package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int b = in.nextInt();
        int bb [] = new int[b];

        for (int i = 0;i<b;i++)
            bb[i] = in.nextInt();

        int g = in.nextInt();
        int gg [] = new int[g];

        for (int i = 0;i<g;i++)
            gg[i] = in.nextInt();

        int result = 0;
        Arrays.sort(bb);
        Arrays.sort(gg);

        for (int i = 0;i<b;i++)
        {
            for(int j = 0;j<g;j++){

                if(Math.abs(bb[i] - gg[j]) <=1 ){
                    result++;
                    gg[j] = 1000;
                    break;
                }
            }
        }
        out.print(result);
    }
}
