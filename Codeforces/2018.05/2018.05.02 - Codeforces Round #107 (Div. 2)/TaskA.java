package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n,k,l,c,d,p,nl,np;
        n = in.nextInt();
        k = in.nextInt();
        l = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        p = in.nextInt();
        nl = in.nextInt();
        np = in.nextInt();

        int kl = k*l;
        int toasts = kl/nl;
        int limes = c*d;
        int salts = p/np;

        int res = Math.min(toasts,Math.min(limes,salts))/n;
        out.print(res);


    }
}
