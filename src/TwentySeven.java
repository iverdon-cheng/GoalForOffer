/**
 * @author iverdon
 * @date 2020/9/4 14:10
 */
public class TwentySeven {
    public void Mirror(TreeNode root) {
        TreeNode treeNode = root;
        if (treeNode != null){
            TreeNode temp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
