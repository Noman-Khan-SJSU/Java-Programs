package DataStructures.Stack.LinkedListImplementation;

class StackUsingLinkedList
{
    private Node top;

    void push(Object value)                 // Inserting at the beginning of the Linked List has constant time complexity i.e. O(1).
    {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    void pop()                              // Also known as peek().
    {
        if (top == null)
            return;
        top = top.next;
    }

    boolean isEmpty()
    {
        if (top == null)
            return true;
        return false;
    }

    void print()
    {
        Node temp = top;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    Object top()
    {
        return top.data;
    }

}
