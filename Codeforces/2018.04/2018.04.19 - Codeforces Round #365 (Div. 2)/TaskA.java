package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int count_m = 0 , count_c = 0;
        for (int i =0;i<n;i++){
            int a = in.nextInt(), b = in.nextInt();
            if( a>b)
                count_m++;
            else if( a<b)
                count_c++;
        }
        if(count_m == count_c)
            out.print("Friendship is magic!^^");
        else if(count_m > count_c)
            out.print("Mishka");
        else
            out.print("Chris");


    }
}
