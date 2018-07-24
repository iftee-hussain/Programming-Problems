package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        Map<Integer,Integer> fg = new HashMap<>();
        for(int i = 1; i<= n ; ++i){
            fg.put(in.nextInt(), i);
        }
        for(int i = 1; i<= n ; ++i){
            if(i>1) out.print(" ");
            out.print(fg.get(i));
        }

    }
}
