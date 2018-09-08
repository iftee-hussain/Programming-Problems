package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        boolean notChanged = true;
        String [] output = new String[n];

        for(int i = 0 ; i< n ;i++){
            String s = in.nextString();


            for(int j = 0;j< s.length() && notChanged;j+=3)
            {
                int x = s.charAt(j) - '0';
                int y = s.charAt(j+1) -  '0';

                if( x == 31 && y ==31){
                    StringBuilder myName = new StringBuilder(s);
                    myName.setCharAt(j, '+');
                    myName.setCharAt(j+1, '+');
                    s = myName.toString();
                    notChanged = false;
                }

            }
            output[i] = s;

        }

        if(!notChanged)
        {
            out.println("YES");
            for(int i = 0 ; i< n ;i++){
                out.println(output[i]);
            }
        }else{
            out.println("NO");
          
        }
    }
}
