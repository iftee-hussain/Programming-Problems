package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int temp ;
        int res = 0, resb = 0;

        if(b>a){
            temp=b;
            b=a;
            a= temp;
        }

         a -= b;

        if(a>=2)
            res = res + a/2;

        out.print(b +" "+ res);


    }
}
