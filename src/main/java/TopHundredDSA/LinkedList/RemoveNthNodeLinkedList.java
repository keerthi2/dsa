package TopHundredDSA.LinkedList;

import static TopHundredDSA.LinkedList.Node1.checkSizeOfLinkedList;
import static TopHundredDSA.LinkedList.Node1.printLinkedList;

public class RemoveNthNodeLinkedList {

    static Node1 removeNthNodeFromLinkedList(Node1 head, int n) {
        Node1 curr = head;
        if (n == checkSizeOfLinkedList(head)) {
            curr = curr.next;
            printLinkedList(curr);
            return curr;
        }
        if (checkSizeOfLinkedList(head) - n == checkSizeOfLinkedList(head)) {
            printLinkedList(curr);
            return curr;
        }
        int nodetoBeremoved = checkSizeOfLinkedList(head) - n;
        int countNode = 1;
        while (curr != null) {
            if (countNode == nodetoBeremoved) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
            countNode++;
        }
        printLinkedList(head);
        return curr;
    }
}
