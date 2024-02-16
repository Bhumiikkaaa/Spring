import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue{
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //Queue can also be written here
        //
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.offer(10);
        pq.offer(86);
        pq.offer(45);
        System.out.println(pq);
        pq.poll(); //Deletes the element with highest priority
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        

    }
}