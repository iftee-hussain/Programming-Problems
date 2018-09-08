package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        String values [] = new String[n];

        for (int i = 0; i < n; i++) {
            values[i] = in.nextString();
            Character c = values[i].charAt(1);

            if(values[i].charAt(0) =='R' && Character.isDigit(c)){
                out.print(method1(values[i]));
            }
            else{
                out.print(method2(values[i]));
            }

        }
    }

    private void method1(String value) {
        int r = 0, c = 0;
        String s ="";

        for (int i = 1; i < value.length(); i++) {
            if(value.charAt(i) == 'C'){

                r = Integer.parseInt(s);
                s = "";

            }
            s += value.charAt(i);

            if(i == value.length()-1){

                c = Integer.parseInt(s);


            }
        }

        String res = getStringCol(c);

    }

    private String getStringCol(int c) {
        ArrayList<Character> list = new ArrayList<>();
        c = c/26;
        list.add((char) c);
        int x = c %26;
        while(x!=0){
            c = c/26;
            list.add((char) c);
            x
        }
    }

    private void method2(String value) {
    }

}
