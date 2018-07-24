package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String inp = in.nextString();
        int upper = 0;
        int lower = 0;
        for (int i = 0; i<inp.length(); ++i){
            if(inp.charAt(i) < 95)
                upper++;
            else
                lower++;

        }
        if(upper > lower)
            out.print(inp.toUpperCase());
        else
            out.print(inp.toLowerCase());
    }
}
