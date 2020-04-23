public class MyStack {

    public int[] arr;
    private int size;
    private int index=0;

    public MyStack(int size){
        this.size =size;
        arr = new int[size];
    }

    boolean isFull(){
        if (index==size)
            return true;
        return false;
    }

    boolean isEmpty(){
        if (index==0)
            return true;
        return false;
    }

    char push(char element){
        if (isFull()){
            throw new StackOverflowError("Stack is full !");
        }
        arr[index] =element;
        index++;
        return (char) arr[index];
    }

    char pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is null");
        }
        return (char) arr[--index];
    }
    int getSize(){
        return index;
    }

}
