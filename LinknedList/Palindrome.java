public class Palindrome {
    public class Node{ // this is a node class
        int data;
        Node next;

        public Node(int data){ //node constructor
            this.data = data;
            this.next = null;
        }  
    } 

    public static Node head;
    public static Node tail;

    public void addFirst(int data){  // method
            // step1 = create newNode
            Node newNode = new Node(data); // object

            if(head == null){
                head = tail = newNode;
                return;
            }

            //step2 = next<=head
            newNode.next = head; //get the value(link)
            
            //step3 head<=next
            head = newNode;

        } 


    public void print(){
        if(head==null){
                System.out.println("LL is empty");
                return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // slow , fast approach 
    public Node findMid(Node head){  //helper 
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){  // odd && even
            slow = slow.next;  // +1
            fast = fast.next.next;  //+2
        }

        return slow; // slow is my middle 
    }

    public boolean checkPalindrome(){
        // corner case
        if(head==null || head.next==null){
            return true;
        }

        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - 2nd half  -> reverse logic
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right  = prev; // right half head
        Node left = head; // left half head

        // step3 - check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome pd = new Palindrome();

        pd.addFirst(1);
        pd.addFirst(2);
        pd.addFirst(2);
        pd.addFirst(1);
        

        pd.print();

        System.out.println(pd.checkPalindrome());
    }
}
