/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public int findSecondMinimumValue(TreeNode root) {
    if (root == null)
      return -1;
    return findSecondMinimumValue(root, root.val);
  }

  private int findSecondMinimumValue(TreeNode root, int mn) {
    if (root == null)
      return -1;
    if (root.val > mn)
      return root.val;

    final int leftMin = findSecondMinimumValue(root.left, mn);
    final int rightMin = findSecondMinimumValue(root.right, mn);

    if (leftMin == -1 || rightMin == -1)
      return Math.max(leftMin, rightMin);
    return Math.min(leftMin, rightMin);
  }
}