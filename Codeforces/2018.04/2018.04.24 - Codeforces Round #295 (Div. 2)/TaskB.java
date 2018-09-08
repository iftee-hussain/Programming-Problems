package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.LinkedList;
import java.util.Queue;

public class TaskB {

    static  class Vertex{
        int val, pos;

        Vertex(int val, int pos){
            this.val = val;
            this.pos = pos;
        }

    }

    int bfs(int n , int m){
        Queue< Vertex> q = new LinkedList<>();
        q.add(new Vertex(n,0));
        boolean [] visited = new boolean[10050];

        while (!q.isEmpty()){
            Vertex u = q.remove();

            int val = u.val;
            int pos = u.pos;
            visited[val] = true;

            if(val == m)  return pos;
            else{
                if(val * 2 == m) return pos+1;
                else if(val*2 < m+11 && !visited[val*2]) q.add(new Vertex(val*2, pos+1));

                if(val -1 == m) return  pos +1;
                else if(val -1 >= 0 && !visited[val-1]) q.add(new Vertex(val-1,pos+1));
            }
        }
        return  0;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        out.print(bfs(n,m));

    }
}
