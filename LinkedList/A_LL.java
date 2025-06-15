package LinkedList;

class Node {
    int data;
    Node next;
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class A_LL {
    // Convert 1D arr to LL
    static Node arrtoLL(int arr[], Node head) {
        if (arr.length == 0) {
            return null;
        }
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    // Print LL
    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Length of LL
    static int lengthLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp= temp.next;
        }
        return cnt;
    }
    // Search an elem in LL
    static boolean isPresent(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Node head= null;
        if (arr.length != 0) {
            head = new Node(arr[0]);
        }
        printLL(arrtoLL(arr, head));
        System.out.println(lengthLL(head));
        System.out.println(isPresent(head, 1));
    }
}
