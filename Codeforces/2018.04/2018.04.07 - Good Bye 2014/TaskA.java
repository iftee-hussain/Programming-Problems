package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskA {
    static class  Vertex{
        List<Vertex> vertices = new ArrayList<>();
        int index;
        Vertex(int index){
            this.index = index;
        }
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();

        Map<Integer, Vertex> mapVertices = new HashMap();

        Vertex src = new Vertex(1);
        mapVertices.put(1, src);

        for (int i =1 ; i<= n-1; ++i){
            int a = in.nextInt();

            Vertex aa = null;
            if(mapVertices.get(i+a) == null){
                aa = new Vertex(i+a);
                mapVertices.put(i+a, aa);
            }else{
                aa = mapVertices.get(i+a);
            }


            Vertex bb = null;
            if(mapVertices.get(i) !=null){
                bb = mapVertices.get(i);
                bb.vertices.add(aa);
            }



        }
        out.print(dfs(src, n, t));


    }

    private String dfs(Vertex src, int n, int t) {
        boolean [] visited = new boolean[n+1];
        Arrays.fill(visited, false);
        Stack<Vertex> stack = new Stack<>();
        stack.push(src);

        while (!stack.empty()){
            Vertex u = stack.pop();
            if(!visited[u.index]){
                visited[u.index] = true;
                List<Vertex> listVertices = u.vertices;
                for(int i =0; i< listVertices.size();++i){
                    Vertex v = listVertices.get(i);
                    if(!visited[v.index]){
                        stack.push(v);
                    }
                }

            }
        }

        if(visited[t])
            return "YES";
        else
            return "NO";
    }
}
