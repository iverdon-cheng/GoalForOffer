/**
 * @author iverdon
 * @date 2020/9/4 13:07
 */
public class TwentyFive {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null){
            return false;
        }
        return (isSubTreeWithRoot(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2));
    }

    private boolean isSubTreeWithRoot(TreeNode root1, TreeNode root2) {
        if (root1 == null){
            return true;
        }
        if (root2 == null){
            return false;
        }
        if (root1.val == root2.val){
            return isSubTreeWithRoot(root1.left,root2.left) && isSubTreeWithRoot(root1.right,root2.right);
        }
        return false;
    }
}
