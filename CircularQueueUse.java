/**
 * CircularQueueUse
 */
public class CircularQueueUse {

    public static void main(String[] args) {
        
        CircularQueue queue = new CircularQueue();
        int a[]={10,20,30,40,50};
        for(int i=0;i < a.length;i++){
            for(int elem : a){
                try {
                    queue.enQueue(elem);
                } catch (QueueFullException e) {
                    
                }
            }
            while (!queue.isEmpty()) {
                try {
                    System.out.println(queue.deQueue());
                } catch (QueueEmptyException e) {
                    
                };
            }

        }
    }
}