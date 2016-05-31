package DataStructures.Stack.ArrayImplementation;

class Main
{
    public static void main(String[] args)
    {
        StackUsingArray stack = new StackUsingArray();
        stack.push(1); stack.print();
        stack.push(2); stack.print();
        stack.push(3); stack.print();
        stack.pop(); stack.print();
        stack.push(5); stack.print();
        System.out.println(stack.isEmpty());
        System.out.println(stack.top());
    }
}