package DataStructures.LinkedList.Doubly.Implementation;

class List
{
    private Node head;

    public void insertAtFirst(Object value)
    {
        Node first = new Node(value);
        if (head == null)
        {
            head = first;
            return;
        }
        first.next = head;
        head.prev = first;
        head = first;                           // By default, first.prev will be equal to null.
    }

    public void insertAtLast(Object value)
    {
        Node last = new Node(value);
        if(head == null)
        {
            head = last;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = last;
        last.prev = temp;                       // By default, last.next will be equal to null.
    }

    public void printIterative()                // Same logic as singly linked list.
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printIterativeReverse()
    {
        Node temp = head;
        if (temp == null)
            return;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

}
