package ds;

public class BasicQueue<X> {
    private X[] data;
    private int queuePointer = 0;
    
    public BasicQueue() {
        this(1000);
    }
    
    public BasicQueue(int size) {
        data = (X[])new Object[size];
    }
    
    public void enqueue(X newItem) {
        data[queuePointer++] = newItem;
        queuePointer++;
        
    }
    
    public X dequeue() {
        queuePointer--;
        return data[0];
        
    }
    
    public boolean search(X item) {
        
    }
    
    public X access(X item) {
        
    }
}
