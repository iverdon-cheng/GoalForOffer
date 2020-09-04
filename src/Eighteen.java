/**
 * @author iverdon
 * @date 2020/9/2 18:33
 */
public class Eighteen {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null){
            return null;
        }
        if (tobeDelete.next != null){
            tobeDelete.val = tobeDelete.next.val;
            tobeDelete.next = tobeDelete.next.next;
        }else {
            if (head == tobeDelete){
                return null;
            }else {
                ListNode temp = head;
                while (temp.next != tobeDelete){
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
        return head;
    }
}
