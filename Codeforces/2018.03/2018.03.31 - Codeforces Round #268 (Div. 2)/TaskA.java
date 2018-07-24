package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> setin = new HashSet<>();
        int n = in.nextInt();

        for(int i = 0; i<n ;++i){
            set.add(i+1);
        }
        int k = in.nextInt();
        for(int i = 0; i<k ;++i){
           setin.add(in.nextInt());
        }
       int l = in.nextInt();
        for(int i = 0; i<l ;++i){
            setin.add(in.nextInt());
        }

        if(setin.containsAll(set))
            out.print("I become the guy.");
        else
            out.print("Oh, my keyboard!");
    }
}
