class Node {
    int data;
    Node next;
    Node() {
        this.data = 0;
        this.next = null;
    }
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class A_Add2Num {

    static Node add2Num(Node head1, Node head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummyHead = new Node(-1);
        Node temp = dummyHead;
        int carry = 0;
        while(temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }
            Node newNode = new Node(sum%10);
            carry = sum/10;
            temp.next = newNode;
            temp = temp.next;
        }
        if(carry != 0) {
            Node newNode = new Node(carry);
            temp.next = newNode;
        }
        return dummyHead.next;
    }

    static void printLL(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // reverse are given, ans also in reverse
        // int arr1[] = {2,4,3};// actually 342
        // int arr2[] = {5,6,4};// actually 465
        int arr1[] = {};// actually 342
        int arr2[] = {};// actually 465
        Node head1 = null;
        Node head2 = null;
        if(arr1.length != 0) {
            head1 = new Node(arr1[0]);
            Node temp1 = head1;
            for(int i=1; i<arr1.length; i++) {
                Node newNode = new Node(arr1[i]);
                temp1.next = newNode;
                temp1 = temp1.next;
            }
        }

        if(arr2.length != 0) {
            head2 = new Node(arr2[0]);
            Node temp2 = head2;
            for(int i=1; i<arr2.length; i++) {
                Node newNode = new Node(arr2[i]);
                temp2.next = newNode;
                temp2 = temp2.next;
            }
        }

        Node newHead = add2Num(head1, head2);
        printLL(newHead);
    }
}