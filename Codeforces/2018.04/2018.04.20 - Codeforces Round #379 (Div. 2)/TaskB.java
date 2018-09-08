package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a =  in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();

        int arr [] = new int[3];
        int sum  = 0;

        arr[0] = a;
        arr[1] = c;
        arr[2] = d;

        Arrays.sort(arr);
        if(a>0 && c >0 && d>0)
        sum += arr[0] * 256;

        a -= arr[0];


        int aa[] = new int[2];
        aa[0] = b;
        aa[1] = a;

        Arrays.sort(aa);

        if(b>0 && a >0)
        sum+= aa[0] * 32;

        out.print(sum);
    }
}
