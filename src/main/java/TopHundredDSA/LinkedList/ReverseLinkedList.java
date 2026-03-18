package TopHundredDSA.LinkedList;

public class ReverseLinkedList {

    static void main() {
       Node1 head =new Node1(1);
       head.next = new Node1(2);
       head.next.next = new Node1(3);
       head.next.next.next = new Node1(4);
       head.next.next.next.next = new Node1(5);
       printLinkedList(head);
       head=reverseLinkedList(head);
       printLinkedList(head);
    }

    public  static Node1 reverseLinkedList(Node1 head) {
      //1, 2,3,4,5 null
        Node1 current = head;
        Node1 temp=head;
        Node1 prev=null;
// temp=1-->null
        while(current!=null){
            current=current.next;
            temp.next=prev;
            prev=temp;
            temp=current;
        }
return prev;
    }

    public static void printLinkedList(Node1 head) {
        Node1 current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

}
