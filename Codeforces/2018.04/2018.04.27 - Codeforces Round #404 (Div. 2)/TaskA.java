package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);

        int n = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += map.get(in.nextString());
        }
        out.print(res);


    }
}
