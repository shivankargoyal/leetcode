class Solution {
    private Set<Integer> schedForDel = new HashSet<>();
    private List<TreeNode> rootNodes = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(var node : to_delete){
            schedForDel.add(node);
        }
        makeDeletions(root, true);
        return rootNodes;
    }
    private void makeDeletions(TreeNode currNode, boolean isIndependent){
        if(currNode == null)return;
        if(!schedForDel.contains(currNode.val) && isIndependent){
            rootNodes.add(currNode);
        }
        boolean makeChildIndep = false;
        TreeNode leftChild = currNode.left, rightChild = currNode.right;
        if(schedForDel.contains(currNode.val)){
            makeChildIndep = true;
        }
        if(leftChild != null && schedForDel.contains(leftChild.val)){
            currNode.left = null;
        }
        if(rightChild != null && schedForDel.contains(rightChild.val)){
            currNode.right = null;
        }
        makeDeletions(leftChild, makeChildIndep);
        makeDeletions(rightChild, makeChildIndep);
    }
}