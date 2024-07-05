class Solution {
    private void dfs(List<List<Integer>> graph, boolean[] vis, int node){
        vis[node] = true;
        for(int nbr : graph.get(node)){
            if(vis[nbr] == false){
                dfs(graph, vis, nbr);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < isConnected.length; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < isConnected.length; i++){
            for(int j = 0; j < isConnected[0].length; j++){
                if(isConnected[i][j] == 1 && i != j){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        int cnt = 0;
        boolean[] vis = new boolean[isConnected.length];
        for(int i = 0; i < isConnected.length; i++){
            if(vis[i] == false){
                dfs(graph, vis, i);
                cnt++;
            }
        }
        return cnt;
    }
}