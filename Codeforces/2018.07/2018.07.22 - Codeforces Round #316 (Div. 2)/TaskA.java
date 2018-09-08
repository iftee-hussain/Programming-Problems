package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        Pair pair[] = new Pair[n];
        for (int i = 0; i < n; i++) {
            pair[i] = new Pair(i,0);
        }

        for (int i = 0; i < m; i++) {
            long [] votes = new long[n];
            long big = 0;

            for (int j = 0; j < n; j++) {
                votes[j] = in.nextLong();

            }
            int index = findWhoWon(votes);
            //out.println("won : "+ index +" votes: "+ votes[index]);
            pair[index].n = pair[index].n+1;
            //out.println("pair :"+ index + " city : "+ pair[index].n);
        }

        Arrays.sort(pair, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.n.compareTo(p2.n);
            }
        });


        int maxVotes = pair[n-1].n;

        out.print(getWinner(pair, maxVotes));

    }

    private int getWinner(Pair[] pair, int maxVotes) {
        int index = pair[pair.length-1].i;
        for (int i = pair.length-2; i >=0 ; i--) {
            if(pair[i].n == maxVotes){
                if(pair[i].i<index)
                    index = pair[i].i;
            }
            else
            break;
        }
        return  index +1;
    }

    private int findWhoWon(long[] votes) {
        long f = votes[0];
        int index = 0;
        for (int i = 1; i < votes.length; i++) {
            if(votes[i] > f){
                index =i;
                f = votes[i];
            }
        }
        return index;
    }

    static class Pair{
        Integer i ;
        Integer n;
        Pair(int i, int n){
            this.i = i;
            this.n = n;

        }


    }
}
