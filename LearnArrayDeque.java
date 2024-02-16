import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(20); //Adds element at last position
        adq.offerFirst(10); //Adds element at starting position
        adq.offerLast(30); //Adds element at last
        adq.offer(40);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        adq.poll();
        System.out.println(adq);
        adq.pollFirst();
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);
    }
    
}
