package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int counta=0, countb=0;
        for(int i =0;i<n ;i++){
            if(in.nextCharacter()=='A') counta++;
            else countb++;
        }
        if(counta==countb)
            out.print("Friendship");
        else if(counta>countb)
            out.print("Anton");
        else
            out.print("Danik");
    }
}
