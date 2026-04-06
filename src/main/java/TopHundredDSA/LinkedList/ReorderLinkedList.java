package TopHundredDSA.LinkedList;

import static TopHundredDSA.LinkedList.Node1.printLinkedList;
import static TopHundredDSA.LinkedList.ReverseLinkedList.reverseLinkedList;

public class ReorderLinkedList {

    static Node1 reorderLinkedList(Node1 head) {
        Node1 curr = cloneList(head);
        Node1 reversedList = reverseLinkedList(head);
        Node1 reorderedList = curr;
        reorderedList.next = reversedList;
        Node1 temp = reorderedList.next;
        int index = 2;
        while (reversedList.next != curr.next) {
            if (index % 2 == 0) {
                temp.next = curr.next;
                curr = curr.next;
                temp = temp.next;
            } else {
                temp.next = reversedList.next;
                reversedList = reversedList.next;
                temp = temp.next;

            }
            index++;

        }
        printLinkedList(reorderedList);
        return reorderedList;
    }

    static Node1 cloneList(Node1 head) {
        if (head == null) return null;

        Node1 newNode = new Node1(head.data);
        newNode.next = cloneList(head.next);

        return newNode;
    }
}
