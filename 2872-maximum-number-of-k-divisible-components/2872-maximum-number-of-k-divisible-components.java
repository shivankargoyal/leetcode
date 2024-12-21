import java.util.*;

class Solution {
    private Map<Integer, List<Integer>> adj; // Adjacency list to represent the tree
    private int comp; // Counter for components divisible by k

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        adj = new HashMap<>();
        comp = 0;

        // Build the adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.computeIfAbsent(u, key -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, key -> new ArrayList<>()).add(u);
        }

        // Perform DFS from node 0 (assuming it is the root)
        dfs(0, -1, values, k);

        return comp;
    }

    private int dfs(int root, int parent, int[] values, int k) {
        int sum = values[root]; // Start with the current node's value

        // Traverse all neighbors (children in the tree)
        for (int neighbor : adj.getOrDefault(root, Collections.emptyList())) {
            if (neighbor != parent) { // Avoid revisiting the parent
                sum += dfs(neighbor, root, values, k); // Accumulate subtree sum
            }
        }

        // Check if the current subtree's sum is divisible by k
        if (sum % k == 0) {
            comp++; // Increment component count
            return 0; // Reset the sum for the current subtree
        }

        return sum % k; // Return the remainder to the parent
    }
}