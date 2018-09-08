package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n =  in.nextInt();

        String s1 = in.nextString();
        String s2 = in.nextString();
        int sum = 0 ;

        for(int i = 0 ; i<n; i++){
            int a = Integer.parseInt(s1.charAt(i)+"");
            int b = Integer.parseInt(s2.charAt(i)+"");

            int temp;
            if(b>a){
                temp = b;
                b = a;
                a = temp;
            }
            
            int x = a-b;
            int y = b-a;

            if(y < 0 )
                y +=10;

            if(x>y)
                sum+=y;
            else
                sum+=x;

           // out.print("*"+sum);

        }

        out.print(sum);

    }
}
