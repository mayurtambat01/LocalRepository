
public class QueueUse {

    public static void main(String[] args) {
        
        QueueUsingArray queue = new QueueUsingArray();
        for(int i=1;i <= 11;i++){
            try {
                queue.enQueue(i);
            } catch (QueueFullException e) {
                
            }
        }
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.deQueue());
            } catch (QueueEmptyException e) {
                
            }
        }
    }
    
}