package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/4 14:18
 */
public class TwentyEight {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null){
            return true;
        }
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    private boolean isSymmetrical(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val == right.val){
            return isSymmetrical(left.left,right.right) && isSymmetrical(right.left,left.right);
        }
        return false;
    }
}
