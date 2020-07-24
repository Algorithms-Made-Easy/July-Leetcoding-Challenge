class Solution {
    List<List<Integer>> res;
    int[][] graph; 
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res=new ArrayList<>();
        this.graph = graph;
        List<Integer> path=new ArrayList<>();
        path.add(0);
        helper(path,0);
        return res;
    }
    
    void helper(List<Integer> path, int node){
        if(node==graph.length-1){
            res.add(new ArrayList(path));
            return;
        }
        for(int i:graph[node]){
            path.add(i);
            helper(path,i);
            path.remove(path.size()-1);
        }
    }
}
