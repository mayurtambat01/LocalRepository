import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class ReverseQueue {
 
    public static void reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()){
            return;
        }
        int front = queue.poll();
        reverseQueue(queue);
        queue.add(front);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                queue.add(sc.nextInt());
            }

            reverseQueue(queue);

            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
        }
        sc.close();
}
}