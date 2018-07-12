package ds;

public class BasicQueue<X> {
    private X[] data;
    private int front;
    private int end;
    
    public BasicQueue() {
        this(1000);
    }
    
    public BasicQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (X[])new Object[size];
    }
    
    public int size() {
        if (front == -1 && end == -1) {
            return 0;
        }
        else {
            return end - front + 1;
        }
    }
    
    public void enqueue(X newItem) {
        if ((end + 1) % data.length == front) {
            throw new IllegalStateException("The Queue is Full");
        }
        else if (front == -1) {
            front = 0;
            end = 0;
            data[end] = newItem;
        }
        else {
            end++;
            data[end++] = newItem;
        }
    }
    
    public X dequeue() {
        X item = null;
        
        if (size() == 0) {
            throw new IllegalStateException("The Query is Empty");
        }
        
        else if (front == end) {
            item = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        }
        
        else {
            item = data[front];
            data[front] = null;
            front++;
        }
        
        return item;
    }
    
    public boolean contains(X item) {
        if (size() == 0) {
            return false;
        }
        
        else {
            for (int i = front; i < end; i++) {
                if (data[i].equals(item)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public X access(int position) {
        if (size() == 0 || position > size()) {
            throw new IllegalArgumentException("This queue is empty or this position choice is not within the bounds of the queue");
        }
        
        else {
            return data[front + position];
        }
    }
}
