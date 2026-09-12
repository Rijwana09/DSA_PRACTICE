public class DeleteNth {
    
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

    public void delNthfromEnd(int n){
        //calculate size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        } 
        if(n==size){
            head = head.next; // removefirst
            return;
        }

        //size - n

        int i=1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        } 
        prev.next = prev.next.next;
        return ; 
    }

    public static void main(String[] args) {
        DeleteNth dn = new DeleteNth();
        dn.addFirst(5);
        dn.addFirst(4); 
        dn.addFirst(3);
        dn.addFirst(2);
        dn.addFirst(1);
        
        dn.print();
        
        dn.delNthfromEnd(3);
        dn.print();
    }
}
