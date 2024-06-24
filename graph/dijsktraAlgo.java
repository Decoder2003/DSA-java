// https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
class Pair{
    int node;
    int distance;
    Pair(int node, int distance){
        this.node = node;
        this.distance = distance;
    }
}

class Solution
{
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)-> x.distance - y.distance);
        int[] dist = new int[V];
        for(int i=0; i<V; i++) dist[i] = (int)1e9;

        dist[S] = 0;
        pq.add(new Pair(S,0));

        while(pq.size()!=0){
            int distance = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for(int i=0; i<adj.get(node).size(); i++){
                int weight  = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);

                if(distance + weight < dist[adjNode]){
                    dist[adjNode] = distance + weight;
                    pq.add(new Pair(adjNode, dist[adjNode]));

                }
            }
        }
        return dist;
    }
}