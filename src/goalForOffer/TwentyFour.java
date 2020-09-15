package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/4 11:03
 */
public class TwentyFour {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode temp = new ListNode(-1);
        while (head != null){
            ListNode next = head.next;
            head.next = temp.next;
            temp.next = head;
            head = next;
        }
        return temp.next;
    }
}
