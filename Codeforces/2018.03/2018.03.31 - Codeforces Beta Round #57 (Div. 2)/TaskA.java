package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String i1 = in.nextString();
        String i2 = in.nextString();
        String output = "";
        for(int i =0 ;i<i1.length(); i++){
            int i3 = Integer.parseInt(i1.charAt(i) + "") ^ Integer.parseInt(i2.charAt(i) + "");
            output+=i3;
        }
        out.print(output);
    }
}
