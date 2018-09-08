package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskA {

    public static String uniqueCharacters(String test){
        String temp = "";
        int [] chars = new int[1000];
        for (int i = 0; i < test.length(); i++){
            char current = test.charAt(i);
           if(chars[current] == 0 ){
               temp+=current;
               chars[current] = 1;
           }

        }

       return temp;

    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String s [] = new String[n];
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            s[i] = in.nextString();


        }
        for (int i = 0; i < n; i++) {

            String x = uniqueCharacters(s[i]);
            char [] a = x.toCharArray();
            Arrays.sort(a);
            x = new String(a);
            if(x != null && !x.isEmpty()){
                set.add(x);

            }


        }

        out.print(set.size());




    }
}
