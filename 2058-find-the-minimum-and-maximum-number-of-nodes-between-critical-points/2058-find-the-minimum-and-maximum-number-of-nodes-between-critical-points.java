/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = new int[]{-1, -1};
        Integer prev_critical_ind = null, first_critical_ind = null;
        ListNode prev = head;
        ListNode cur = head.next;
        int cur_ind = 1;

        while (cur.next != null) {
            if ((cur.val > prev.val && cur.val > cur.next.val) ||
                (cur.val < prev.val && cur.val < cur.next.val)) {
                if (prev_critical_ind != null) {
                    res[0] = (res[0] == -1) ? cur_ind - prev_critical_ind : Math.min(res[0], cur_ind - prev_critical_ind);
                } else {
                    first_critical_ind = cur_ind;
                }
                prev_critical_ind = cur_ind;
            }
            prev = cur;
            cur = cur.next;
            cur_ind++;
        }

        if (prev_critical_ind != null && !prev_critical_ind.equals(first_critical_ind)) {
            res[1] = prev_critical_ind - first_critical_ind;
        }

        

        return res;
    }
}