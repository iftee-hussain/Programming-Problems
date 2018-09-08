package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        char a[] = new char[n+1];

        int sum = 0, s  = 0;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n+1; i++) {

            if(i == n)
                a[i] = 'W';
            else
                a[i] = in.nextCharacter();
            
            if(a[i] =='W'){
                if(i>0){
                    if( a[i-1] == 'B'){
                        res.add(sum);
                        sum = 0;
                        s++;
                    }

                }

            }
            else if(a[i] == 'B'){
                sum++;

            }

        }

        out.println(s);
        for (int x: res) {
            out.print(x + " ");
        }
    }

}
