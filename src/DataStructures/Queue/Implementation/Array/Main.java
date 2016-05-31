package DataStructures.Queue.Implementation.Array;

class Main {

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        queue.print();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.rear());
        System.out.println(queue.front());
        queue.numberOfElements();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.print();
        System.out.println(queue.rear());
        System.out.println(queue.front());
        queue.dequeue();
        queue.dequeue();
        queue.print();
        queue.numberOfElements();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.dequeue();
        System.out.println(queue.front());
        System.out.println(queue.rear());
    }

}
