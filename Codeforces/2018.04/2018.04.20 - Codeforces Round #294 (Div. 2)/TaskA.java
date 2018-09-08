package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int weights[] = new int[500];

        weights['Q'] = weights['q'] = 9;
        weights['R'] = weights['r'] = 5;
        weights['B'] = weights['b'] = 3;
        weights['N'] = weights['n'] = 3;
        weights['P'] = weights['p'] = 1;
        weights['K'] = weights['k'] = 0;

        boolean w_k_exists = false;
        boolean b_k_exists = false;


        int w_white = 0, w_black = 0;

        for (int i = 0; i < 8; i++) {
            String n = in.nextString();
            for (int j = 0; j < 8; j++) {
                if(n.charAt(j) == '.')
                    continue;
                else if(n.charAt(j) == 'K')
                    w_k_exists = true;
                else if(n.charAt(j) == 'k')
                    b_k_exists = true;
                else{
                    if(Character.isUpperCase(n.charAt(j)))
                        w_white += weights[n.charAt(j)];
                    else
                        w_black += weights[n.charAt(j)];
                }
            }

        }
        /*if(w_k_exists)
            w_white++;
        if(b_k_exists)
            w_black++;*/


        if(w_white == w_black)
            out.print("Draw");
        else if(w_white > w_black)
            out.print("White");
        else
            out.print("Black");
    }
}
