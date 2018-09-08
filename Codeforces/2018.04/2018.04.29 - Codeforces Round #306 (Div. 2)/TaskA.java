package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String x = in.nextString();

            vector<int> ab;
            bitset<MAXL> ba;

            int upto = str.length() - 1;

            for(int i = 0; i < upto; ++i) {
                if(str[i] == 'A' && str[i+1] == 'B')
                    ab.push_back(i);
                else if(str[i] == 'B' && str[i+1] == 'A')
                    ba[i] = true;
            }

            bool flag = false;

            if(ba.any()) {
                for(auto& x : ab) {
                    if(x == 0) {
                        bool x_next = ba[x+1];
                        ba[x+1] = false;

                        flag = ba.any();

                        ba[x+1] = x_next;
                    }
                    else {
                        bool x_prev = ba[x-1], x_next = ba[x+1];
                        ba[x-1] = ba[x+1] = false;

                        flag = ba.any();

                        ba[x-1] = x_prev, ba[x+1] = x_next;
                    }

                    if(flag) break;
                }
            }

            cout << ((flag)? "YES\n" : "NO\n");
        

    }
}
