import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        //queue = FIFO data structure first in first out
        // add  = enqueue, offer()
        //remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        //Empty method
        System.out.println(queue.isEmpty());
        //Syze of the queue
        System.out.println(queue.size());
        //To know if the queue contains the specific index
        System.out.println(queue.contains("Harold"));
        //System.out.println(queue.peek());
        for (int i = 0; i < 4; i++) {
            queue.poll();
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue);


    }
}
