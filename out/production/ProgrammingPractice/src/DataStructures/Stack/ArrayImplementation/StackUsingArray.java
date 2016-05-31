package DataStructures.Stack.ArrayImplementation;

class StackUsingArray
{
    private int[] A = new int[100];
    private int top = -1;

    void push(int x)
    {
        if (top == 99)
        {
            System.out.println("Error: Stack Overflow!");
            return;
        }
        A[++top] = x;
    }

    void pop()
    {
        if (top == -1)
        {
            System.out.println("Stack already empty!");
            return;
        }
        top--;
    }

    int top()                           // Also known as peek()
    {
        return A[top];
    }

    boolean isEmpty()
    {
        if (top == -1)
            return true;
        return false;
    }

    void print()
    {
        for (int i=0 ; i<=top; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

}