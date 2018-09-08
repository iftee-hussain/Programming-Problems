package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskB {

   public boolean isFullySorted(int [] A){
       for (int i = 0; i < A.length; i++) {

            if(A[i] >A[i+1]) return false;
       }
       return true;
   }

    public int solution(int[] A) {
      int n = A.length;
      

    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int [] a = in.nextIntArray(7);
        out.print(solution(a));
    }
}
