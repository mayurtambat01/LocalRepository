import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i <= 10;i++){
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }    
}