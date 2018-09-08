package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String n = in.nextString();
        int max = -1;
        int prev = -1;
        int cons =1;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == 'A' || n.charAt(i) == 'E' || n.charAt(i) == 'I'
                    ||n.charAt(i) == 'O' || n.charAt(i) == 'U' || n.charAt(i) == 'Y'){

                max = Math.max(cons,max);
                cons = 1;


            }else {
                cons++;
            }
        }
        max = Math.max(cons,max);
        out.print(max);
    }
}
