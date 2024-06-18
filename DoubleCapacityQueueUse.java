
public class DoubleCapacityQueueUse {

    public static void main(String[] args) {
        
        DoubleCapacityQueue queue = new DoubleCapacityQueue(5);
        for(int i=1;i <= 8;i++){
            queue.enQueue(i);
        }
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.deQueue());
            } catch (QueueEmptyException e) {
                
            }
        }
    }
}