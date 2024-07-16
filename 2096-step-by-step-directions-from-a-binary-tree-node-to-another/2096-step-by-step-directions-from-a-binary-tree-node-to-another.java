class Solution {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lca = findLCA(root, startValue, destValue);
        
        StringBuilder startPath = new StringBuilder();
        StringBuilder destPath = new StringBuilder();
        
        findPath(lca, startValue, startPath);
        findPath(lca, destValue, destPath);
        
        // Convert start path to 'U's
        for (int i = 0; i < startPath.length(); i++) {
            startPath.setCharAt(i, 'U');
        }
        
        return startPath.toString() + destPath.reverse().toString();
    }
    
    private TreeNode findLCA(TreeNode node, int p, int q) {
        if (node == null || node.val == p || node.val == q) {
            return node;
        }
        
        TreeNode left = findLCA(node.left, p, q);
        TreeNode right = findLCA(node.right, p, q);
        
        if (left != null && right != null) {
            return node;
        }
        
        return left != null ? left : right;
    }
    
    private boolean findPath(TreeNode node, int target, StringBuilder path) {
        if (node == null) {
            return false;
        }
        
        if (node.val == target) {
            return true;
        }
        
        if (findPath(node.left, target, path)) {
            path.append('L');
            return true;
        }
        
        if (findPath(node.right, target, path)) {
            path.append('R');
            return true;
        }
        
        return false;
    }
}