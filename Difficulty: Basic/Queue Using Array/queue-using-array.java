class myQueue {
    
    int capacity;
    int arr[];
    int front,rear;
    

    

    // Constructor
    public myQueue(int n) {
        
        capacity = n;
        arr = new int[capacity];
        front=-1;
        rear=-1;
        
    }

    public boolean isEmpty() {
       return front==-1;
    }

    public boolean isFull() {
        return rear == capacity-1 && front == 0;
    }

    public void enqueue(int x) {
        if(isFull()) return;
        if(front==-1) front=0;
        
        arr[++rear] = x;
        
    }

    public void dequeue() {
        if(isEmpty()) return;
        
        int x = arr[front++];
        
        if(front > rear) front=rear=-1;
        
    }

    public int getFront() {
        
        if(isEmpty()) return -1;
        
        return arr[front];
        
    }

    public int getRear() {
        if(isEmpty()) return -1;
        return arr[rear];
    }
}
