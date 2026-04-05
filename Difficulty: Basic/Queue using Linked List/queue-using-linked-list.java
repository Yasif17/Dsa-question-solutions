// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    
    Node head,tail;
    int size=0;
    
    public myQueue() {
    }

    public boolean isEmpty() {
        return head==null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if(tail!=null) tail.next = newNode;
        tail = newNode;
        if(head==null) head = tail;
        size++;
    }

    public void dequeue() {
        if(head==null) throw new RuntimeException("Queue is empty");
        int value = head.data;
        head = head.next;
        if(head==null) tail = null;
        size--;
    }

    public int getFront() {
        if(isEmpty()) return -1;
        int value = head.data;
        return value;
    }

    public int size() {
        return size;
    }
}
