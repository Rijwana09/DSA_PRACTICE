public class Zig_zag {

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
    
    public void zigzag(){ 
        //find mid
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){  
            slow = slow.next;  // +1
            fast = fast.next.next;  //+2
        }

        Node mid = slow;
        
        // reverse 2nd half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alternate merging
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
         
    }

    public static void main(String[] args) {
        Zig_zag ll = new Zig_zag();

        // Create our own linked list
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);

        System.out.println("Before :");
        ll.printList(ll.head);

        ll.zigzag();

        System.out.println("After :");
        ll.printList(ll.head);
    }
}
