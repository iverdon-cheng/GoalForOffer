package goalForOffer;

import goalForOffer.TreeNode;

/**
 * @author iverdon
 * @date 2020/9/14 16:52
 */
public class ThirtySix {

    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode root){
        inOrder(root);
        return head;
    }

    private void inOrder(TreeNode node) {
        if (node == null){
            return;
        }
        inOrder(node.left);
        node.left = pre;
        if (pre != null){
            pre.right = node;
        }
        pre = node;
        if (head == null){
            head = node;
        }
        inOrder(node.right);
    }
}
