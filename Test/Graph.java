import java.io.*;
import java.util.*;

public class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v,int w) { //เมทอดสำหรับเพิ่มเส้นเชื่อม (edge) ระหว่าง vertex v และ w ในกราฟ.
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4); //สร้างกราฟด้วยจำนวน vertices เท่ากับ 4
        g.addEdge(0, 1); //เพิ่มเส้นเชื่อมระหว่าง vertices ตามที่กำหนดในโจทย์
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        System.err.println("Breath First Traversal (from vertex 2)");
        g.BFS(2); //เรียกใช้เมทอด BFS เพื่อทำ BFS บนกราฟที่สร้างขึ้น จาก vertex ที่ 2
    }
}