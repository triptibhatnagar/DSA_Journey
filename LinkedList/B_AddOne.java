class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class B_AddOne {
    // 1 -> 2 -> 3 -> 4 -> null
    // 4 -> 3 -> 2 -> 1 -> null
    static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode temp = head;
        ListNode front = null;
        while(temp != null) {
            // 1 linking with 1 iteration
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    static ListNode addOne(ListNode head) {
        head = reverse(head);
        int carry = 1;
        ListNode temp = head;
        while(temp != null) {
            int sum = temp.val + carry;
            carry = sum/10;// 1
            temp.val = sum%10;//0
            if(carry == 0) break;
            if(temp.next == null && carry != 0) {
                temp.next = new ListNode(carry);
                break;//it is very very important, bcoz now a new node is added to temp.next and temp is now no longer null here
            }
            temp = temp.next;
        }
        head = reverse(head);
        return head;
    }
}
