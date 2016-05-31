package DataStructures.Queue.Implementation.LinkedList;

class QueueUsingLinkedList {

    private Node front;             // Pointer/reference to the first node.
    private Node rear;              // Pointer/reference to the last node.

    public void enqueue(Object data){               // Inserting/pushing from the end of the list.
        Node last = new Node(data);
        if ( front == null && rear == null) {
            front = rear = last;
            return;
        }
        rear.next = last;
        rear = last;                // After the execution of this method, local reference variable 'last' will be cleared from the memory.
    }

    public void dequeue(){              // Removing/popping from the beginning of the list.
        if (front == null){
            System.out.println("Queue is empty!");
            return;
        }
        if (front == rear){
            front = rear = null;
        }
        else {
            front = front.next;
        }
    }

    public Object front(){
        if (front == null){
            System.out.println("Queue is empty!");
            return null;
        }
        return front.data;
    }

    public Object rear(){
        if (rear == null){
            System.out.println("Queue is empty!");
            return null;
        }
        return rear.data;
    }

    public boolean isEmpty(){
        return (front == null);
    }

    public void print(){
        if (front == null){
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}