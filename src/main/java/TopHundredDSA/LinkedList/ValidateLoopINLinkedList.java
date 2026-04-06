package TopHundredDSA.LinkedList;

import java.util.HashSet;

public class ValidateLoopINLinkedList {
    static void main() {

    }

    static boolean validateCircleInLinkedList(Node1 head) {
        Node1 curr = head;
        HashSet<Node1> set = new HashSet<>();
        while (curr != null) {
            if (set.contains(curr)) {
                return true;
            }
            set.add(curr);
            curr = curr.next;

        }
        return false;
    }


}
