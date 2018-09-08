package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.LinkedList;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.nextString();
        int sum = 0;


       sum+= calculateMinLen('a',s.charAt(0));

        for (int i = 0; i < s.length()-1; i++) {

            sum += calculateMinLen(s.charAt(i), s.charAt(i+1));
        }

        out.print(sum);
    }

    private int calculateMinLen(char c, char c1) {
        if(c == c1) return  0;
        int diff1 = Math.abs(c-c1);
        int diff2 = 26 % diff1;


        return diff1 > diff2&& diff1>13?diff2:diff1;
    }


}
