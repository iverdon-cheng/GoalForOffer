import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author iverdon
 * @date 2020/9/4 18:27
 */
public class ThirtyTwo {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(root);
        while (queue.size()!=0){
            int cnt = queue.size();
            while (cnt-- > 0){
                TreeNode node = queue.poll();
                if (node == null){
                    continue;
                }
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return list;
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        boolean flag = false;
        nodes.add(pRoot);
        boolean reverse = false;
        while (!nodes.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int cnt = nodes.size();
            while (cnt-- > 0){
                TreeNode node = nodes.poll();
                if (node == null){
                    continue;
                }
                list.add(node.val);
                nodes.add(node.left);
                nodes.add(node.right);
            }
            if (reverse){
                Collections.reverse(list);
            }
            reverse  = !reverse;
            if (list.size() != 0){
                ret.add(list);
            }
        }
        return ret;
    }
}
