package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        int count = a ;
        int countb = 0;
        while(count>0){
            count--;
            countb++;
            if(countb == b){
                count++;
                a++;
                countb = 0;
            }

        }
        out.print(a);
    }
}
