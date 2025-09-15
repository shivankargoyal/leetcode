# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        def dfs(u, d):
            nonlocal md, s
            if not u:
                return
            if d > md:
                md = d
                s = u.val
            elif d == md:
                s += u.val
            dfs(u.left, d + 1)
            dfs(u.right, d + 1)
        md = -1
        s = 0
        dfs(root, 0)
        return s