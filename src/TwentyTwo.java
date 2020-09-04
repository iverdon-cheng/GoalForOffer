/**
 * @author iverdon
 * @date 2020/9/4 10:15
 */
public class TwentyTwo {

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null){
            return null;
        }
        ListNode temp = head;
        for (int i=0; i<k; i++){
            if (temp == null){
                return null;
            }
            temp = temp.next;
        }
        ListNode result = head;
        while (temp != null){
            result = result.next;
            temp = temp.next;
        }
        return result;
    }
}
