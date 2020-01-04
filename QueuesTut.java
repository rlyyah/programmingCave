import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuesTut {
    public static void main(String[] args){
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

        q1.add(10);
        q1.add(20);
        q1.add(30);

        try {
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue");
        }

        for(Integer element: q1){
            System.out.println("Queue item: " + element);
        }

        System.out.println("Queue element to be removed: " + q1.remove());
        System.out.println("Queue element to be removed: " + q1.remove());
        System.out.println("Queue element to be removed: " + q1.remove());
        try {
            System.out.println("Queue element to be removed: " + q1.remove());
        } catch (Exception e) {
            System.out.println("Tried to remove too many elements from the queue");
        }

        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        q2.offer(2);
        q2.offer(3);
        q2.offer(4);

        if(q2.offer(2) == false){
            System.out.println("no free space left in the queue");
        }
        System.out.println("Item to be removed: " + q2.poll());
        System.out.println("Item to be removed: " + q2.poll());
        if(q2.poll()==null){
            System.out.println("There are no more items to be removed from the queue");
        }
    }
}