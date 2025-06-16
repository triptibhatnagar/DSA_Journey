package LinkedList.SingleLL;

// make a ll
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

public class A_Traversal {
    static void traversal(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    static Node arrToLL(int arr[], Node head) {
        if(head == null) {
            return null;
        }
        Node temp = head;
        for(int i=1; i<arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        // convert array to ll
        int arr[] = {};
        Node head;
        if(arr.length == 0) {
            head = null;
        }else {
            head = new Node(arr[0]);
        }
        arrToLL(arr, head);
        traversal(head);
    }
}