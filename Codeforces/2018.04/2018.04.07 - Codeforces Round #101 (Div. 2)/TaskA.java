package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String a = in.nextString();
        String b = in.nextString();
        String c = in.nextString();

        String d = a+b;
        char [] a1 = d.toCharArray();
        Arrays.sort(a1);

        char [] c1 = c.toCharArray();
        Arrays.sort(c1);
        boolean yes = true;
        if(a1.length == c1.length){
            for (int i =0; i<a1.length; ++i){
                if(a1[i] != c1[i]){
                     yes = false;
                    break;
                }
            }

        }else
            yes = false;


        if(!yes)
            out.print("NO");
        else
            out.print("YES");


    }
}
