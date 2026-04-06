package TopHundredDSA.LinkedList;

public class Node1 {
    int data;
    Node1 next;
    public Node1(int data) {
        this.data = data;
        this.next = null;
    }

    static void printLinkedList(Node1 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(" ");
    }
    static int checkSizeOfLinkedList(Node1 head) {
        int count = 0;
        Node1 curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
