package DataStructures.Queue.Implementation.LinkedList;

class Main {

    public static void main(String[] args) {

        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.print();
        System.out.println(queue.isEmpty());
        System.out.println(queue.rear());
        System.out.println(queue.front());
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
        System.out.println(queue.isEmpty());
        queue.dequeue();
        System.out.println(queue.front());
        System.out.println(queue.rear());
    }

}
