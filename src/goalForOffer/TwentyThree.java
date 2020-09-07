package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/4 10:50
 */
public class TwentyThree {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return null;
        }
        ListNode fast = pHead;
        ListNode slow = pHead;
        do {
            fast = fast.next.next;
            slow = slow.next;
        }while (fast != slow);
        fast = pHead;
        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
