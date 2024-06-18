/**
 * DoubleCapacityQueue
 */
public class DoubleCapacityQueue {

    private int data[];
    private int front;
    private int rear;
    private int size;

    DoubleCapacityQueue(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }
    DoubleCapacityQueue(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int getSize(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    int front() throws QueueEmptyException{
        if (size==0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enQueue(int elem){
        if (size==data.length) {
            DoubleCapacity();
        }
        if (size==0) {
            front = 0;
        }
        rear++;
        if (rear==data.length) {
            rear = 0;
        }
        size++;
        data[rear] = elem;
    }
    private void DoubleCapacity() {
        int temp[]=data;
        data = new int[2 * temp.length];
        int index = 0;
        for(int i=front;i < temp.length;i++){
            data[index] = temp[i];
            index++;
        }
        for(int i=0;i <= front-1;i++){
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length-1;
    }
    int deQueue() throws QueueEmptyException{
        if (size==0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front++;
        if (front==data.length) {
            front = 0;
        }
        if (size==0) {
            front = -1;
            rear = -1;
        }
        size--;
        return temp;
    }

}