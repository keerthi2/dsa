package TopHundredDSA.LinkedList;

import java.util.LinkedList;
import java.util.List;

import static TopHundredDSA.LinkedList.Node1.printLinkedList;

public class MergeLinkedList {
    static void main() {
    }

    static Node1 mergeTwoSortedLinkedList(Node1 head1, Node1 head2) {
        Node1 curr1 = head1;
        Node1 curr2 = head2;
        Node1 mergedList;
        if (curr1.data < curr2.data) {
            mergedList = curr1;
            curr1 = curr1.next;

        } else {
            mergedList = curr2;
            curr2 = curr2.next;

        }
        // mergedList.next=null;
        //  printLinkedList(mergedList);
        Node1 temp = mergedList;
        while (curr1 != null && curr2 != null) {
            if (curr1.data < curr2.data) {
                temp.next = curr1;
                curr1 = curr1.next;
            } else {
                temp.next = curr2;
                curr2 = curr2.next;
            }
            temp = temp.next;
        }
        while (curr1 != null) {
            temp.next = curr1;
            curr1 = curr1.next;
            temp = temp.next;
        }
        while (curr2 != null) {
            temp.next = curr2;
            curr2 = curr2.next;
            temp = temp.next;
        }

//printLinkedList(mergedList);
        return mergedList;

    }
    static void mergeKSortedLinkedList(List<Node1> data) {
        Node1 mergedList = data.get(0);

        for (int i = 1; i < data.size(); i++) {
            mergedList = mergeTwoSortedLinkedList(mergedList, data.get(i));
        }

        printLinkedList(mergedList);


    }


}
