package goalForOffer;

import java.util.HashMap;

public class Five {
    private HashMap<Integer, Integer> indexForInOrders = new HashMap<>();

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        for (int i=0; i<in.length; i++){
            indexForInOrders.put(in[i],i);
        }
        return reConstructBinaryTree(pre, 0, pre.length-1, 0); 
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL>preR){
            return null;
        };
        TreeNode root = new TreeNode(pre[preL]);
        int leftTreeSize = indexForInOrders.get(root.val)-inL;
        root.left = reConstructBinaryTree(pre,preL+1, preL+leftTreeSize, inL);
        root.right = reConstructBinaryTree(pre, preL+leftTreeSize+1, preR, inL+leftTreeSize+1);
        return root;
    }
    public TreeNode reConstructBinaryTree1(int[] pos, int[] in){
        for (int i=0; i<pos.length; i++){
            indexForInOrders.put(in[i],i);
        }
        return reConstructBinaryTree1(pos,0, pos.length-1,0);
    }

    private TreeNode reConstructBinaryTree1(int[] pos, int posL, int posR, int inL) {
        if (posL>posR){
            return null;
        }
        TreeNode root = new TreeNode(pos[posR]);
        int leftTreeSize = indexForInOrders.get(root.val)-inL;
        root.left = reConstructBinaryTree1(pos,posL,posL+leftTreeSize-1,inL);
        root.right = reConstructBinaryTree1(pos,posL+leftTreeSize+1,posR-1,inL+leftTreeSize+1);
        return root;
    }
}
