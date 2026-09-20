package double_linkedlist;
public class DL {
    
    public class Node{  // node class
        int data;
        Node next;
        Node prev;

        Node(int data){ // node obj
            this.data = data;
            this.next = null;
            this.prev = null;  
        }
    } 

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    } 

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("dLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val; 
    }
    public int removeLast(){
        if(head == null){
            System.out.println("dLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;       
        tail.next = null;       
        size--;
        return val; 
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        tail = head;  // Update tail to old head

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = tail.next;
    }

    public static void main(String[] args) {
        DL dll = new DL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);

        dll.print();

        System.out.println(dll.size);

        dll.reverse();
        dll.print();

        dll.removeFirst();
        dll.print();

        dll.removeLast();

        dll.print();

        System.out.println(dll.size);
    }
} 

