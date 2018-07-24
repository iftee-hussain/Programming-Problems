package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String input = in.readLine();
        Set<Character> chars = new HashSet<>();
        for (int i =0 ; i<input.length() ; i++){
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
                chars.add(input.charAt(i));

        }
        out.print(chars.size());
    }
}
