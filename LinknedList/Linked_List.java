
public class Linked_List {

    public static class Node {
        int data;
        Node next; // why we define as node because next means -> denote next node 
        
        public Node(int data){ //constructor
            this.data=data; //current data will save 
            this.next=null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int size;


        public void addFirst(int data){  // method
            // step1 = create newNode
            Node newNode = new Node(data); // object
            size++;

            if(head == null){
                head = tail = newNode;
                return;
            }

            //step2 = next<=head
            newNode.next = head; //get the value(link)
            
            //step3 head<=next
            head = newNode;

        } 

        public void addLast(int data){
            // step1 = create newNode
            Node newNode = new Node(data);
            size++;

            if(head == null){
                head = tail = newNode;
                return;
            }

            //step2 = next<=tail
            tail.next = newNode;

            //step3 - tail = newNode
            tail = newNode;
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

        public void add(int idx, int data){

            if(idx == 0){
                addFirst(data);
                return;
            }
            
            Node newNode = new Node(data);
            size++;

            Node temp = head;
            int i = 0;

            while(i < idx-1){
                temp = temp.next;
                i++;
            }

            //i=idx-1; temp->prev
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public int removeFirst(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;

            }else if(size==1){
                int val = head.data;
                head = tail = null;
                size = 0; 
                return val;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val; 
        }

        public int removeLast(){
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;

            }else if(size==1){
                int val = head.data;
                head = tail = null;
                size = 0; 
                return val;
            }

            // prev : i = size-2 (last idx n-1 2nd last idx n-2) 
            Node prev = head;
            for(int i=0; i<size-2; i++){
                prev = prev.next;
            }

            int val = prev.next.data; // tail.data 
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        public int iterativeSearch(int key){
            Node temp = head;
            int i = 0;

            while(temp != null){
                if(temp.data == key){ // key found
                    return i;
                } 
                temp = temp.next;
                i++;
            }
            return -1;
        }

        public int helper(Node head, int key){
            //base case
            if(head==null){ 
                return -1;
            }

            if(head.data == key){ 
               return 0;
            }

            int idx = helper(head.next, key);
            if(idx == -1) {
                return -1;
            }

            return idx+1;
        } 

        public int recSearch(int key){
            return helper(head, key);
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


        public static boolean isCycle(){ //floyd's alg
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next; //+1
                fast = fast.next.next; //+2 move
                if(slow == fast){  //cycle found
                    return true;   
                }
            }
            return false;  // cycle does not found
        }

        public static void removeCycle(){
            // detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = true;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    cycle = true;
                    break;
                }
            }
            if(cycle == false){
                return ;
            }

            // find meeting point

            slow = head;
            Node prev = null; //last node

            while(slow != fast){
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            // remove last node -> last.next

            prev.next = null;

        }

    public static void main(String[] args) {
        head = new Node(1); 
        Node temp = new Node(2);
        head.next = temp; 
        head.next.next = new Node(3); 
        head.next.next.next = temp;  
        // 1->2->3->2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
} 