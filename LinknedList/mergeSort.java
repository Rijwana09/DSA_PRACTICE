public class mergeSort {

        public static class Node{
        Node next;
        int data;

        public Node(int data){
            this.data=data;
            this.next=null;
        } 
    }

    public void printList(Node head) {

    Node temp = head;

    while(temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
}
    
    public Node head;

    private Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
           temp = temp.next;
        }

        return mergeLL.next;
    } 

    private  Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next; 
        }

        return slow; // mid node
    }

    public Node merge_sort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //left & right MS

        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = merge_sort(head);
        Node newRight = merge_sort(rightHead);

        //merge
        return merge(newLeft, newRight);

    }
    public static void main(String[] args) {

        mergeSort ll = new mergeSort();

        // Create our own linked list
        ll.head = new Node(5);
        ll.head.next = new Node(4);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(2);
        ll.head.next.next.next.next = new Node(1);

        System.out.println("Before sorting:");
        ll.printList(ll.head);

        // Merge Sort
        ll.head = ll.merge_sort(ll.head);

        System.out.println("After sorting:");
        ll.printList(ll.head);
    }
}
