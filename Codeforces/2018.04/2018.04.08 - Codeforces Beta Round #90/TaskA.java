package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public int GCD(int a, int b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int count = 0;
        int res = 0;
        while(n>0){
            if(count == 0){
                int s = GCD(a,n);
                n = n-s;
                res = count;
                count++;
            } else{
                int s =  GCD(b,n);
                n = n - s;
                res = count;
                count--;
            }


        }

        out.print(res);
    }
}
