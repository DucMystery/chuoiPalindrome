public class MyQueue {

    private int capacity;
    private int[] queueArr;
    private int head =0;
    private int tail =-1;
    private int currentSize =0;

    public MyQueue(int capacity){
        this.capacity =capacity;
        queueArr = new int[capacity];
    }

    boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }

        return status;
    }

    boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0)
            status = true;
        return status;
    }

    void enqueue(int item){
        if (isQueueFull()){
            System.out.printf("ERROR");
        }else {
            tail++;
            if (tail ==capacity){
                tail =0;
            }
            queueArr[tail] =item;
            currentSize++;
            System.out.println("Element "+item+" is pushed to Queue !");
        }
    }

    void dequeue(){
        if (isQueueEmpty()){
            System.out.println("ERROR !");
        }else {
            head++;
            if (head==capacity-1){
                System.out.println("Pop is "+queueArr[head-1]);
                head =0;
            }else {
                System.out.println("Pop is "+queueArr[head-1]);
            }
            currentSize--;
        }
    }
}
