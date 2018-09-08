package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int  n = in.nextInt();
        char [] s = new char[n];

        int a [] = new int[2];

        for (int i = 0; i < n; i++) {
            s[i] = in.nextCharacter();
            if(s[i] == '0')
                a[0]++;
            else
                a[1]++;
        }

        if(s.length == 1 )
            out.print(s[0]);
        else{


                String ss = "1" ;
                for (int i = 0; i < a[0]; i++) {
                    ss += "0";
                }
                out.print(ss);

        }

    }
}
