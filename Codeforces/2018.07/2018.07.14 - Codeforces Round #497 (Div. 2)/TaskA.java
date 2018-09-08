package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String n = in.nextString();
        int l = n.length();

        int i = 0;
        for (i = 0; i < l; ) {
            if(n.charAt(i) == 'n'){
                i++;
                continue;
            }

            else {
                if(isConsonant(n.charAt(i))){
                   if(!isConsonant(n.charAt(i+1))){
                       i = i+2;
                    }
                    else {
                       break;
                   }
                }
                else{
                    if(!isConsonant(n.charAt(i))){
                        if(isConsonant(n.charAt(i+1))){
                            i = i+2;
                        }
                    }
                    else {
                        break;
                    }
                }
            }
        }
        if(i>=l)
            out.println("YES");
        else
            out.print("NO");
    }

    private boolean isConsonant(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return false;
        }
        return true;

    }

}
