import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); //Adding elements in a queue
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);
        System.out.println(queue.poll()); //Deletes element from queue
        System.out.println(queue);
        System.out.println(queue.peek()); //Tells the next element that will be popped
    }
}
