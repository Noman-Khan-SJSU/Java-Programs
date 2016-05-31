package DataStructures.Queue.Implementation.Array;

class QueueUsingArray {

    private Object[] A = new Object[100];
    private int front = -1;
    private int rear = -1;

    public void enqueue(Object x){                              // Always take care of the corner cases in any implementation because most bugs are due to it.
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        else if (isEmpty()) {
            front = rear = 0;
        }
        else {
            rear = (rear+1) % A.length;                         // Using circular array since because of it, no index position is wasted when using Enqueue after Dequeue methods, until the array is full.
        }
        A[rear] = x;
    }

    public void dequeue(){                                      // Always take care of the corner cases in any implementation because most bugs are due to it.
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if (front == rear) {                                    // Queue has only one element.
            front = rear = -1;                                  // Represents an empty queue.
        }
        front = (front+1) % A.length;                           // Else increment front.  // Deleting the value in front is unnecessary.
    }

    public Object front(){                                      // This method is applicable for static memory implementations only i.e. data structure of fixed size.
        if (front != -1)
            return A[front];
        System.out.println("Queue is Empty!");
        return null;
    }

    public Object rear(){
        if (rear != -1)
            return A[rear];
        System.out.println("Queue is Empty!");
        return null;
    }

    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }

    public boolean isFull(){
        return ((rear+1) % A.length == front);
    }

    public void numberOfElements(){
        if (front == -1 && rear == -1){
            System.out.println("0");
            return;
        }
        int count = (rear-front+A.length) % A.length + 1;
        System.out.print(count);
        System.out.println();
    }

    public void print(){
        if (front == -1 && rear == -1){
            System.out.println("Queue is Empty!");
            return;
        }
        int count = (rear-front+A.length) % A.length + 1;
        for (int i=0; i<count; i++){
            int index = (front+i)%A.length;
            System.out.print(A[index] + " ");
        }
        System.out.println();
    }

}