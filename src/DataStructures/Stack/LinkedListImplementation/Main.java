package DataStructures.Stack.LinkedListImplementation;

class Main
{
    public static void main(String[] args)
    {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1); stack.print();
        stack.push(2); stack.print();
        stack.push(3); stack.print();
        stack.pop(); stack.print();
        stack.push(7); stack.print();
        System.out.println(stack.isEmpty());
        System.out.println(stack.top());
    }
}
