
public class RevLinked {

    public static class Node {
        int data;
        Node next; // why we define as node because next means -> denote next node 
        
        public Node(int data){ //constructor
            this.data = data; //current data will save 
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
            //base case
            if(head==null){
                System.out.println("LL is empty");
                return;
            }

            Node temp = head; //head value store temporily

            while(temp != null){ // loop stop if temp = null

                System.out.print(temp.data+"->"); // temp data will print
                temp = temp.next; // temp next data store in temp
            }

            System.out.println("null");
        }



    public void reverse(){
        Node prev = null;
        Node curr = tail = head ;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

       public static void main(String[] args) {
        RevLinked ll = new RevLinked();  // object create
        ll.addFirst(5);
        ll.addFirst(4); 
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        
        ll.print();

        ll.reverse();

        ll.print();
    }
}
