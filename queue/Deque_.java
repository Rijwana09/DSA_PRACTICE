import java.util.*;
public class Deque_ {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);// 1
        deque.addFirst(2);//2 1
        deque.addLast(3);

        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
    }
}
